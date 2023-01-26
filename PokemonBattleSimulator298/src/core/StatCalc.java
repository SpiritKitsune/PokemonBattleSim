package core;

public class StatCalc 
{
	public static final int ATTACK = 0;
	public static final int DEFENSE = 1;
	public static final int SP_ATTACK = 2;
	public static final int SP_DEFENSE = 3;
	public static final int SPEED = 4;
	
	public static final int HARDY = 0;
	public static final int LONELY = 1;
	public static final int BRAVE = 2;
	public static final int ADAMANT = 3;
	public static final int NAUGHTY = 4;
	public static final int BOLD = 5;
	public static final int DOCILE = 6;
	public static final int RELAXED = 7;
	public static final int IMPISH = 8;
	public static final int LAX = 9;
	public static final int TIMID = 10;
	public static final int HASTY = 11;
	public static final int SERIOUS = 12;
	public static final int JOLLY = 13;
	public static final int NAIVE = 14;
	public static final int MODEST = 15;
	public static final int MILD = 16;
	public static final int QUIET = 17;
	public static final int BASHFUL = 18;
	public static final int RASH = 19;
	public static final int CALM = 20;
	public static final int GENTLE = 21;
	public static final int SASSY = 22;
	public static final int CAREFUL = 23;
	public static final int QUIRKY = 24;
	
	//First is increase, second is decrease
	public static int[][] natures = new int[][]
			{
				{ATTACK, ATTACK},
				{ATTACK, DEFENSE},
				{ATTACK, SP_ATTACK},
				{ATTACK, SP_DEFENSE},
				{ATTACK, SPEED},
				{DEFENSE, ATTACK},
				{DEFENSE, DEFENSE},
				{DEFENSE, SP_ATTACK},
				{DEFENSE, SP_DEFENSE},
				{DEFENSE, SPEED},
				{SP_ATTACK, ATTACK},
				{SP_ATTACK, DEFENSE},
				{SP_ATTACK, SP_ATTACK},
				{SP_ATTACK, SP_DEFENSE},
				{SP_ATTACK, SPEED},
				{SP_DEFENSE, ATTACK},
				{SP_DEFENSE, DEFENSE},
				{SP_DEFENSE, SP_ATTACK},
				{SP_DEFENSE, SP_DEFENSE},
				{SP_DEFENSE, SPEED},
				{SPEED, ATTACK},
				{SPEED, DEFENSE},
				{SPEED, SP_ATTACK},
				{SPEED, SP_DEFENSE},
				{SPEED, SPEED}
			};
	
	public static double calculateNature(int stat, int nature)
	{
		double mod = 1;
		if(natures[nature][0] == natures[nature][1])
		{
			mod = 1;
		}
		else
		{
			if(natures[nature][0] == stat)
			{
				mod = 1.1;
			}
			else if(natures[nature][1] == stat)
			{
				mod = 0.9;
			}
		}
		return mod;
	}
	public static int calculate(double base, double iv, double ev, double level, int statToUpdate, int nature)
	{
		int stat = 0;
		
		stat = (int) (((((2*base+iv+(ev/4))*level)/100)+5)*calculateNature(statToUpdate, nature));
		return stat;
	}
	
	public static int calculateHP(double base, double iv, double ev, double level)
	{
		int stat = 0;
		
		stat = (int) ((((2*base+iv+(ev/4))*level)/100) + level + 10);
		return stat;
	}
	
	public static void calculateLevel(Pokemon pkmn)
	{
		pkmn.setHp(calculateHP(pkmn.getBaseHp(), pkmn.getIvHp(), pkmn.getEvHp(), pkmn.getLevel()));
		pkmn.setAttack(calculate(pkmn.getBaseAttack(), pkmn.getIvAttack(), pkmn.getEvAttack(), pkmn.getLevel(), ATTACK, pkmn.getNature()));
		pkmn.setDefense(calculate(pkmn.getBaseDefense(), pkmn.getIvDefense(), pkmn.getEvDefense(), pkmn.getLevel(), DEFENSE, pkmn.getNature()));
		pkmn.setSpAttack(calculate(pkmn.getBaseSpAttack(), pkmn.getIvSpAttack(), pkmn.getEvSpAttack(), pkmn.getLevel(), SP_ATTACK, pkmn.getNature()));
		pkmn.setSpDefense(calculate(pkmn.getBaseSpDefense(), pkmn.getIvSpDefense(), pkmn.getEvSpDefense(), pkmn.getLevel(), SP_DEFENSE, pkmn.getNature()));
		pkmn.setSpeed(calculate(pkmn.getBaseSpeed(), pkmn.getIvSpeed(), pkmn.getEvSpeed(), pkmn.getLevel(), SPEED, pkmn.getNature()));
	}
}
