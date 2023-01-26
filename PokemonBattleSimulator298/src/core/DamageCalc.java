package core;

import java.util.concurrent.ThreadLocalRandom;

public class DamageCalc 
{
	public static final double MIN = .85;
	public static final double MAX = 1;
	public static final int CRIT_0 = 15;
	public static final int CRIT_1 = 7;
	public static final int CRIT_2 = 1;
	public static final int CRIT_3 = 0;
	public static final double CRIT_SUCCESS = 1.5;
	public static final double CRIT_FAIL = 1;
	public static final double STAB_SUCCESS = 1.5;
	public static final double STAB_FAIL = 1;
	public static final double BURN_REDUCE = 5;
	public static final double NO_BURN_REDUCE = 1;
	public static int calculate(Pokemon user, Pokemon target, Move usedMove)
	{	
		double targets = 1;
		double weather = 1;
		double other = 1;
		
		
		
		double levelVar = ((2*user.level)/5)+2;
		//System.out.println(((2*user.level)/5)+2);
		double noModDamage = ((levelVar*usedMove.power*(calcStat(user, target, usedMove)))/50)+2;
		//System.out.println(((levelVar*usedMove.power*(attack/defense))/50)+2);
		double modifier = targets * weather * calcCritical(user) * calcRandom() * calcStab(user, usedMove) * calcType(target, usedMove) * calcBurn(user, usedMove) * other;
		//System.out.println(targets * weather * critical * 1 * stab * type * burn * other);
		double damage = noModDamage*modifier;
		//System.out.println(noModDamage*modifier);
		
		int finalDamage = (int) damage;
		
		
		return finalDamage;
	}

	private static double calcType(Pokemon target, Move usedMove) 
	{
		if(target.getType2() != TypeTable.NONE)
		{
			return TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target) * TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType2(), target);
		}
		else
		{
			return TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target);
		}
	}
	private static double calcStab(Pokemon user, Move usedMove) 
	{
		if(user.getType1() != TypeTable.NONE && user.getType2() != TypeTable.NONE)
		{
			if(usedMove.getMoveType() == user.getType1() || usedMove.getMoveType() == user.getType2())
			{
				return STAB_SUCCESS;
			}
			else
			{
				return STAB_FAIL;
			}	
		}
		else
		{
			return STAB_FAIL;
		}
	}
	private static double calcRandom() 
	{
		return ThreadLocalRandom.current().nextDouble(MIN, MAX);
	}
	private static double calcCritical(Pokemon user) 
	{
		double random = CRIT_0;
		
		switch((int)user.getCritLevel())
		{
			case 0: random = ThreadLocalRandom.current().nextInt(CRIT_0);
					break;
			case 1: random = ThreadLocalRandom.current().nextInt(CRIT_1);
					break;
			case 2: random = ThreadLocalRandom.current().nextInt(CRIT_2);
					break;
			case 3: random = ThreadLocalRandom.current().nextInt(CRIT_3);
					break;
			case 4: random = ThreadLocalRandom.current().nextInt(CRIT_3); //Level 3 and 4 are identical
					break;
			default: return CRIT_FAIL;
		}

		if (random == 0)
		{
			if(user == CurrentSimData.getCurrentPokemonPlayer())
			{
				BattleHandler.setPlayerCrit(true);
			}
			if(user == CurrentSimData.getCurrentPokemonOpponent())
			{
				BattleHandler.setOpponentCrit(true);
			}
			return CRIT_SUCCESS;
		}
		else
		{
			return CRIT_FAIL;
		}
	}
	private static double calcStat(Pokemon user, Pokemon target, Move usedMove)
	{
		if(usedMove.getCategory() == Move.PHYSICAL)
		{
			return ((double) BattleHandler.calcStage(user.getStageAttack()) 
					* user.getAttack())
					/((double) BattleHandler.calcStage(target.getStageDefense())
						* target.getDefense());
		}
		else if(usedMove.getCategory() == Move.SPECIAL)
		{
			return ((double) BattleHandler.calcStage(user.getStageSpAttack()) 
					* user.getSpAttack())
					/((double) BattleHandler.calcStage(target.getStageSpDefense())
						* target.getSpDefense());
		}
		else
		{
			return 0; //Something has gone very wrong
		}
	}
	private static double calcBurn(Pokemon user, Move usedMove)
	{
		if(user.getStatusNonVolatile() == Status.BURN && usedMove.getCategory() == Move.PHYSICAL)
		{
			return BURN_REDUCE;
		}
		else
		{
			return NO_BURN_REDUCE;
		}
	}
}
