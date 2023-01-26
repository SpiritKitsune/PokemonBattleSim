package core;
import movedata.*;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import movedata.MoveCalcForConfusion;

public class Status 
{
	
	public static final int NONE = 0;
	
	//Non-Volatile Status
	
	public static final int BURN = 1;
	public static final int PARALYSIS = 2;
	public static final int FREEZE = 3;
	public static final int SLEEP = 4;
	public static final int POISON = 5;
	public static final int FAINT = 6;
	public static final int BADLY_POISONED = 7;
	
	//Volatile Status
	
	public static final int BOUND = 1;
	public static final int CANT_ESCAPE = 2;
	public static final int CONFUSED = 3;
	public static final int CURSE = 4;
	public static final int EMBARGO = 5;
	public static final int ENCORE = 6;
	public static final int FLINCH = 7;
	public static final int HEAL_BLOCK = 8;
	public static final int IDENTIFIED = 9;
	public static final int INFATUATION = 10;
	public static final int LEECH_SEED = 11;
	public static final int NIGHTMARE = 12;
	public static final int PERISH_SONG = 13;
	public static final int TAUNT = 14;
	public static final int TELEKINESIS = 15;
	public static final int TORMENT = 16;
	
	//Volatile Battle Status
	
	public static final int AQUA_RING = 1;
	public static final int BRACING = 2;
	public static final int CENTER_OF_ATTENTION = 3;
	public static final int DEFENSE_CURL = 4;
	public static final int GLOWING = 5;
	public static final int ROOTING = 6;
	public static final int MAGIC_COAT = 7;
	public static final int MAGNETIC_LEVITATION = 8;
	public static final int MINIMIZE = 9;
	public static final int PROTECTION = 10;
	public static final int TEAM_PROTECTION = 11;
	public static final int RECHARGING = 12;
	public static final int SEMI_INVULNERABLE = 13;
	public static final int SUBSTITUTE = 14;
	public static final int TAKING_AIM = 15;
	public static final int TAKING_IN_SUNLIGHT = 16;
	public static final int WITHDRAWING = 17;
	public static final int WHIPPING_UP_A_WHIRLWIND = 18;
	
	public static boolean canStatusNonVolatile(Pokemon target, int status) throws BadLocationException
	{
		if(status == NONE 
			&& target.getStatusNonVolatile() != NONE)
		{
			return true;
		}
		if(status == BURN 
			&& target.getStatusNonVolatile() == NONE 
			&& target.getType1() != TypeTable.FIRE 
			&& target.getType2() != TypeTable.FIRE)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" was burned", null);
			return true;
		}
		if(status == FREEZE 
			&& target.getStatusNonVolatile() == NONE 
			&& target.getType1() != TypeTable.ICE 
			&& target.getType2() != TypeTable.ICE 
			&& Weather.getCurrentWeather() != Weather.HARSH_SUNLIGHT)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" was frozen solid", null);

			return true;
		}
		if(status == PARALYSIS 
			&& target.getStatusNonVolatile() == NONE 
			&& target.getType1() != TypeTable.ELECTRIC 
			&& target.getType2() != TypeTable.ELECTRIC)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" was paralyzed", null);

			return true;
		}
		if(status == POISON 
			&& target.getStatusNonVolatile() == NONE 
			&& target.getType1() != TypeTable.POISON 
			&& target.getType2() != TypeTable.POISON
			&& target.getType1() != TypeTable.STEEL
			&& target.getType2() != TypeTable.STEEL)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" was poisoned", null);

			return true;
		}
		if(status == SLEEP 
			&& target.getStatusNonVolatile() == NONE)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" fell asleep", null);

			return true;
		}
		if(status == BADLY_POISONED 
			&& target.getStatusNonVolatile() == NONE 
			&& target.getType1() != TypeTable.POISON 
			&& target.getType2() != TypeTable.POISON
			&& target.getType1() != TypeTable.STEEL
			&& target.getType2() != TypeTable.STEEL)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" was badly poisoned", null);

			return true;
		}
		return false;
	}
	
	public static boolean canStatusVolatile(Pokemon user, Pokemon target, int status)
	{
		if(!target.getStatusVolatile()[status])
		{
			if(status == BOUND)
			{
				if(target.getStatusVolatile()[BOUND])
				{
					return false;
				}
				else
				{
					return true;
				}
			}
			if(status == CANT_ESCAPE)
			{
				return true;
			}
			if(status == CONFUSED)
			{
				if(target.getStatusVolatile()[CONFUSED])
				{
					return false;
				}
				else
				{
					return true;
				}
			}
			if(status == CURSE)
			{
				return true;
			}
			if(status == EMBARGO)
			{
				return true;
			}
			if(status == FLINCH)
			{
				if(BattleHandler.firstHasAttacked)
				{
					return false;
				}
				else
				{
					return true;
				}
			}
			if(status == HEAL_BLOCK)
			{
				return true;
			}
			if(status == IDENTIFIED)
			{
				return true;
			}
			if(status == INFATUATION
					&& user.getGender() != Pokemon.GENDERLESS 
					&& target.getGender() != Pokemon.GENDERLESS
					&& user.getGender() != target.getGender())
			{
				return true;
			}
			if(status == LEECH_SEED)
			{
				return true;
			}
			if(status == NIGHTMARE)
			{
				if(target.getStatusNonVolatile() == SLEEP)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			if(status == PERISH_SONG)
			{
				return true;
			}
			if(status == TAUNT)
			{
				return true;
			}
			if(status == TELEKINESIS)
			{
				if(target.getStatusVolatileBattle()[ROOTING])
				{
					return false;
				}
				else
				{
					return true;
				}
			}
			if(status == TORMENT)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean canStatusVolatileBattle(Pokemon user, Pokemon target, int status)
	{
		if(!target.getStatusVolatileBattle()[status])
		{
			if(status == AQUA_RING)
			{
				return true;
			}
			if(status == BRACING)
			{
				return true;
			}
			if(status == CENTER_OF_ATTENTION)
			{
				return true;
			}
			if(status == DEFENSE_CURL)
			{
				return true;
			}
			if(status == GLOWING)
			{
				return true;
			}
			if(status == ROOTING)
			{
				if(target.getStatusVolatile()[TELEKINESIS]
						|| target.getStatusVolatileBattle()[MAGNETIC_LEVITATION])
				{
					target.updateStatusVolatile(TELEKINESIS, false);
					target.updateStatusVolatileBattle(MAGNETIC_LEVITATION, false);
					return true;
				}
				else
				{
					return true;
				}
			}
			if(status == MAGIC_COAT)
			{
				return true;
			}
			if(status == MAGNETIC_LEVITATION)
			{
				if(target.getStatusVolatileBattle()[ROOTING])
				{
					return false;
				}
				else
				{
					return true;
				}
			}
			if(status == MINIMIZE)
			{
				return true;
			}
			if(status == PROTECTION)
			{
				//TODO Research the consecutive reduction behavior ingame
				return true;
			}
			if(status == TEAM_PROTECTION)
			{
				return true;
			}
			if(status == RECHARGING)
			{
				return true;
			}
			if(status == SEMI_INVULNERABLE)
			{
				return true;
			}
			if(status == SUBSTITUTE)
			{
				return true;
			}
			if(status == TAKING_AIM)
			{
				return true;
			}
			if(status == TAKING_IN_SUNLIGHT)
			{
				return true;
			}
			if(status == WITHDRAWING)
			{
				return true;
			}
			if(status == WHIPPING_UP_A_WHIRLWIND)
			{
				return true;
			}
		}
		return false;
	}

	public static void snvBurn(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusNonVolatile() == BURN)
		{
			BattleHandler.dealDamage(pkmn, (int) (pkmn.getHp()/16));
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" was hurt by its burn", null);
			
		}
	}
	
	public static void snvFreeze(Pokemon pkmn)
	{
		if(pkmn.getStatusNonVolatile() == FREEZE 
				&& ThreadLocalRandom.current().nextInt(4) == 0)
		{
			pkmn.setStatusNonVolatile(NONE);
		}
	}
	
	public static boolean snvParalysis(Pokemon pkmn)
	{
		if(pkmn.getStatusNonVolatile() == PARALYSIS 
				&& ThreadLocalRandom.current().nextInt(3) == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static double paralysisSpeed(Pokemon pkmn)
	{
		if(pkmn.getStatusNonVolatile() == PARALYSIS)
		{
			return .5;
		}
		else
		{
			return 1;
		}
	}
	
	public static void snvPoison(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusNonVolatile() == POISON)
		{
			BattleHandler.dealDamage(pkmn, (int) (pkmn.getHp()/8));
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" was hurt by poison", null);

		}
	}
	
	public static void snvBadlyPoisoned(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusNonVolatile() == BADLY_POISONED)
		{
			pkmn.setBpCounter(pkmn.getBpCounter()+1);
			BattleHandler.dealDamage(pkmn, (int) (pkmn.getHp()*(pkmn.getBpCounter()/16)));
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" was hurt by poison", null);

		}
	}
	
	public static void setSleepCounters(Pokemon pkmn)
	{
		pkmn.setSleepCounter(ThreadLocalRandom.current().nextInt(2)+1);
	}
	
	public static boolean snvSleep(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusNonVolatile() == SLEEP)
		{
			if(pkmn.getSleepCounter() > 0)
			{
				pkmn.setSleepCounter(pkmn.getSleepCounter()-1);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is asleep", null);
				return false;
			}
			else
			{
				pkmn.setStatusNonVolatile(NONE);
				return true;
			}
		}
		else
		{
			return true;
		}
	}
	
	public static void setBoundCounters(Pokemon pkmn)
	{
		pkmn.setBoundCounter(ThreadLocalRandom.current().nextInt(1)+4);
	}
	
	public static void svBound(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatile()[BOUND])
		{
			if(pkmn.getBoundCounter() > 0)
			{
				pkmn.setBoundCounter(pkmn.getBoundCounter()-1);
				BattleHandler.dealDamage(pkmn, (int) pkmn.getHp()/8);
			}
			else
			{
				pkmn.updateStatusVolatile(BOUND, false);
				//TODO Tweak this?
			}
		}
	}
	
	public static boolean svCantEscape(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[CANT_ESCAPE]
				&& pkmn.getType1() != TypeTable.GHOST
				&& pkmn.getType2() != TypeTable.GHOST)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" can't escape", null);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void setConfusionCounters(Pokemon pkmn)
	{
		pkmn.setConfusionCounter(ThreadLocalRandom.current().nextInt(3)+1);
	}
	
	public static boolean svConfusion(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[CONFUSED])
		{
			if(pkmn.getConfusionCounter() > 0)
			{
				pkmn.setConfusionCounter(pkmn.getConfusionCounter()-1);
				if(ThreadLocalRandom.current().nextInt(2) == 0)
				{
					double critHold = pkmn.getCritLevel();
					pkmn.setCritLevel(-1);
					BattleHandler.dealDamage(pkmn, DamageCalc.calculate(pkmn, pkmn, new MoveCalcForConfusion()));
					pkmn.setCritLevel(critHold);
					BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" hurt itself in its confusion", null);

					return false;
				}
			}
			else
			{
				pkmn.updateStatusVolatile(CONFUSED, false);
			}
		}
		return true;
	}
	
	public static void svCurse(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[CURSE])
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" was afflicted by the curse", null);

			BattleHandler.dealDamage(pkmn, (int) pkmn.getHp()/4);
		}
	}
	
	public static void setEmbargoCounters(Pokemon pkmn)
	{
		pkmn.setEmbargoCounter(5);
	}
	
	public static boolean svEmbargo(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatile()[EMBARGO])
		{
			if(pkmn.getEmbargoCounter() > 0)
			{
				pkmn.setEmbargoCounter(pkmn.getEmbargoCounter()-1);
				return false;	
			}
			else
			{
				pkmn.updateStatusVolatile(EMBARGO, false);
				return true;
			}
		}
		else
		{
			return true;
		}
	}
	
	public static boolean svFlinch(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[FLINCH])
		{
			pkmn.updateStatusVolatile(FLINCH, false);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" flinched", null);

			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void setHealBlockCounters(Pokemon pkmn)
	{
		pkmn.setHealBlockCounter(5);
	}
	
	public static boolean svHealBlock(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatile()[HEAL_BLOCK])
		{
			if(pkmn.getHealBlockCounter() > 0)
			{
				pkmn.setHealBlockCounter(pkmn.getHealBlockCounter()-1);
				return false;
			}
			else
			{
				pkmn.updateStatusVolatile(HEAL_BLOCK, false);
				return true;
			}
		}
		else
		{
			return true;
		}
	}
	
	public static double svIdentified(double evasion, Pokemon pkmn)
	{
		if(pkmn.getStatusVolatile()[IDENTIFIED])
		{
			return 1.0;
		}
		else
		{
			return evasion;
		}
	}
	
	public static boolean svInfatuation(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[INFATUATION])
		{
			if(ThreadLocalRandom.current().nextInt(1) == 0)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is immobilized by love", null);

				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return true;
		}
	}
	
	public static void svLeechSeed(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(target.getStatusVolatile()[LEECH_SEED])
		{
			int amount = (int) target.getHp()/8;
			BattleHandler.dealDamage(target, amount);
			BattleHandler.heal(user, amount);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+" had its strength sapped", null);

		}
	}
	
	public static void svNightmare(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[NIGHTMARE])
		{
			if(pkmn.getStatusNonVolatile() == SLEEP)
			{
				BattleHandler.dealDamage(pkmn, (int) pkmn.getHp()/4);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is having a nightmare", null);

			}
			else
			{
				pkmn.updateStatusVolatile(NIGHTMARE, false);
			}
		}
	}
	
	public static void svPerishSong(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatile()[PERISH_SONG])
		{
			if(pkmn.getPerishSongCounter() > 0)
			{
				pkmn.setPerishSongCounter(pkmn.getPerishSongCounter()-1);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" 's perish count fell to "+pkmn.getPerishSongCounter(), null);

			}
			else
			{
				pkmn.setStatusNonVolatile(FAINT);
			}
		}
	}
	
	public static boolean svTaunt(Pokemon pkmn, Move usedMove)
	{
		if(pkmn.getStatusVolatile()[TAUNT])
		{
			if(pkmn.getTauntCounter() > 0)
			{
				pkmn.setTauntCounter(pkmn.getTauntCounter()-1);
				if(usedMove.getCategory() == Move.STATUS)
				{
					return false;
				}
				else
				{
					return false;
				}
			}
			else
			{
				pkmn.setTauntCounter(3);
				pkmn.updateStatusVolatile(TAUNT, false);
				return true;
			}
		}
		else
		{
			return true;
		}
	}
	
	public static boolean svTelekinesis(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatile()[TELEKINESIS]) //TODO Finish this, it's weird
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean svTorment(Pokemon pkmn, Move usedMove)
	{
		if(pkmn.getStatusVolatile()[TORMENT])
		{
			/*int leftWithPP = 0;
			int i = 0;
			while(i < pkmn.getMoveSet().length)
			{
				if(pkmn.getMoveSet()[i].getCurrentPP() > 0)
				{
					leftWithPP++;
				}
				i++;
			}
			if(leftWithPP == 1)
			{
				
			}*/
			//TODO fix this thing, probably needs to move
			if(usedMove == pkmn.getLastMove())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return true;
		}
		
		
	}

	public static void svbAquaRing(Pokemon pkmn) throws BadLocationException
	{
		if(pkmn.getStatusVolatileBattle()[AQUA_RING])
		{
			BattleHandler.heal(pkmn, (int) (pkmn.getHp()/16));
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" was healed by Aqua Ring", null);

		}
	}
	
	public static int svbBracing(Pokemon pkmn, int damage)
	{
		if(pkmn.getStatusVolatileBattle()[BRACING])
		{
			if(pkmn.getHp() <= damage)
			{
				return (int) (pkmn.getHp()-1);
			}
			else
			{
				return damage;
			}
		}
		else
		{
			return damage;
		}
	}
	
	/*public static int svbCenterOfAttention(Pokemon pkmn, Move usedMove)
	{
		if(pkmn.getStatusVolatileBattle()[CENTER_OF_ATTENTION])
		{
			if(usedMove.isCanCOA())
			{
				
			}
		}
	}*/
	//TODO no use until double battles are implemented
	
	public static void svbDefenseCurl(Pokemon pkmn)
	{
		return;
	}
	//TODO Potentially no effect, move to Rollout and Ice Ball
	
	public static void svbGlowing(Pokemon pkmn)
	{
		return; //TODO Finish this
	}
	
	public static void svbRooting(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatileBattle()[ROOTING])
		{
			BattleHandler.heal(pkmn, (int) (pkmn.getHp()/16));
		}
	}
	
	public static boolean svbMagneticLevitation(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatileBattle()[MAGNETIC_LEVITATION]) //TODO Finish this, it's weird
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static double svbMinimize(Pokemon pkmn, Move usedMove)
	{
		if(pkmn.getStatusVolatileBattle()[MINIMIZE])
		{
			if(usedMove instanceof BodySlam
				//|| usedMove instanceof DragonRush
				//|| usedMove instanceof FlyingPress
				//|| usedMove instanceof HeatCrash
				//|| usedMove instanceof HeavySlam
				//|| usedMove instanceof PhantomForce
				//|| usedMove instanceof ShadowForce
				//|| usedMove instanceof Steamroller
				|| usedMove instanceof Stomp)
			{
				return 2.0;
			}
			else
			{
				return 1.0;
			}
		}
		else
		{
			return 1.0;
		}
	}
	
	public static boolean svbProtection(Pokemon pkmn, Move usedMove)
	{
		if(pkmn.getStatusVolatileBattle()[PROTECTION])
		{
			if(usedMove.isProtect())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return true;
		}
	}
	
	//TODO implement Team Protection once double battles are implemented
	
	public static boolean svbRecharging(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatileBattle()[RECHARGING])
		{
			pkmn.updateStatusVolatileBattle(RECHARGING, false);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean svbSemiInvulnerable(Pokemon user, Pokemon target, Move usedMove)
	{
		if(target.getStatusVolatileBattle()[SEMI_INVULNERABLE])
		{
			//TODO Add moves and remove comments
			if((usedMove instanceof Gust
				//|| usedMove instanceof SmackDown
				//|| usedMove instanceof SkyUppercut
				|| usedMove instanceof Thunder
				//|| usedMove instanceof Twister
				//|| usedMove instanceof Hurricane
					)
				&& (target.getLastMove() instanceof Fly
					//|| target.getLastMove() instanceof Bounce
					//|| target.getLastMove() instanceof SkyDrop
						)
					)
			{
				return true;
			}
			else if((usedMove instanceof Earthquake
				//|| usedMove instanceof Magnitude
				|| usedMove instanceof Fissure)
				&& target.getLastMove() instanceof Dig)
			{
				return true;
			}
			else if((usedMove instanceof Surf
					//|| usedMove instanceof Whirlpool
					)
					//&& target.getLastMove() instanceof Dive
					)
				{
					return true;
				}
			else if(//target.getLastMove() instanceof ShadowForce
				//|| target.getLastMove() instanceof PhantomForce
					usedMove instanceof Move) //TODO Remove
			{
				if(user.getStatusVolatileBattle()[TAKING_AIM])
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}
	
	public static void svbSubstitute(Pokemon pkmn)
	{
		if(pkmn.getStatusVolatileBattle()[SUBSTITUTE])
		{
			BattleHandler.dealDamage(pkmn, (int) (pkmn.getCurrentHP()/4));
			//TODO REMEMBER TO IMPLEMENT SUBSTITUTE
		}
	}
	
	public static double svbTakingAim(Pokemon pkmn, double accuracy)
	{
		if(pkmn.getStatusVolatileBattle()[TAKING_AIM])
		{
			return 1.1;
		}
		else
		{
			return accuracy;
		}
	}
	
	public static void svbTakingInSunlight(Pokemon pkmn)
	{
		return; //TODO Finish this
	}
	
	public static void svbWithdrawing(Pokemon pkmn)
	{
		return; //TODO Finish this
	}
	
	public static void svbWhippingUpAWhirlwind(Pokemon pkmn)
	{
		return; //TODO Finish this
	}
}
