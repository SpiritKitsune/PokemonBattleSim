package core;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import movedata.*;
public class BattleHandler 
{
	static final int PLAYER = 0;
	static final int OPPONENT = 1;
	public static int firstAttack;
	static int playerDamageToDeal = 0;
	static int opponentDamageToDeal = 0;
	static int genericDamageToDeal = 0;
	static boolean firstDidHit = false;
	static boolean secondDidHit = false;
	static boolean genericDoesHit = false;
	static boolean firstHasAttacked = false;
	static int playerStatChange[] = {0,0,0,0,0,0,0};
	static int opponentStatChange[] = {0,0,0,0,0,0,0};
	static int timesToHit = 0;
	static double calculatedAccuracy = 0;
	static boolean forceMove = false;
	static Move playerMove = null;
	static Move opponentMove = null;
	static Move genericMove = null;
	
	static boolean lightScreenPlayer = false;
	static boolean lightScreenOpponent = false;
	
	static int lightScreenCounterPlayer = 0;
	static int lightScreenCounterOpponent = 0;
	
	static boolean reflectPlayer = false;
	static boolean reflectOpponent = false;
	
	static int reflectCounterPlayer = 0;
	static int reflectCounterOpponent = 0;
	
	static boolean mist = false;
	static int mistCounter = 0;
	
	static final int ATTACK = 0;
	static final int DEFENSE = 1;
	static final int SP_ATTACK = 2;
	static final int SP_DEFENSE = 3;
	static final int SPEED = 4;
	static final int ACCURACY = 5;
	static final int EVASION = 6;
	
	static boolean playerCrit = false;
	static boolean opponentCrit = false;
	
	static int turnNumber = 0;
	

	public static void runTurn(Move playerMoveHold, Move opponentMoveHold) throws BadLocationException
	{
		if(getCurrentPokemonPlayer().getStatusNonVolatile()==Status.FAINT)
		{
			JOptionPane.showMessageDialog(BattleWindow.contentPane, "\n"+getCurrentPokemonPlayer().getName()+" has fainted and cannot battle!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		turnNumber++;
		updateMoves(playerMoveHold, opponentMoveHold);
		setPlayerCrit(false);
		setOpponentCrit(false);
		statUpdater();
		setGenericDamageToDeal(0);
		//Determine move order
		calcMoveOrder(playerMove, opponentMove);
		BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n[Turn " + turnNumber +"]", TextStyles.getTurnStyle());
		if(getFirstAttack() == PLAYER)
		{
			//Check if user can attack
			if(canAttack(getCurrentPokemonPlayer(), getPlayerMove()))
			{
				moveTextMod(getCurrentPokemonPlayer(), playerMove);
				if(doesHit(playerMove, getCurrentPokemonPlayer(), calcPlayerTarget(playerMove)))
				{				
					setFirstDidHit(true);
					setGenericDoesHit(isFirstDidHit());
					runPlayerMove(playerMove, calcPlayerTarget(playerMove));
				}
				else
				{
					BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nThe attack missed the target", null);
					setFirstDidHit(false);
					setGenericDoesHit(isFirstDidHit());
				}
			}
			setFirstHasAttacked(true);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
			//Check if user can attack
			if(canAttack(getCurrentPokemonOpponent(), getOpponentMove()))
			{
				moveTextMod(getCurrentPokemonOpponent(), opponentMove);				
				if(doesHit(opponentMove, getCurrentPokemonOpponent(), calcOpponentTarget(opponentMove)))
				{
					setSecondDidHit(true);
					setGenericDoesHit(isSecondDidHit());
					runOpponentMove(opponentMove, calcOpponentTarget(opponentMove));
				}
				else
				{
					BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nThe attack missed the target", null);
					setSecondDidHit(false);
					setGenericDoesHit(isSecondDidHit());
				}
			}
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), playerToPost, null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), opponentToPost, null);
//			setBattleText(playerMove, getCurrentPokemonPlayer(), calcPlayerTarget(playerMove), getPlayerDamageToDeal(), isFirstDidHit());
//			setBattleText(opponentMove, getCurrentPokemonOpponent(), calcOpponentTarget(opponentMove), getOpponentDamageToDeal(), isSecondDidHit());
		}
		else
		{
			//Check if user can attack
			if(canAttack(getCurrentPokemonOpponent(), getOpponentMove()))
			{
				moveTextMod(getCurrentPokemonOpponent(), opponentMove);
				if(doesHit(opponentMove, getCurrentPokemonOpponent(), calcOpponentTarget(opponentMove)))
				{
					setFirstDidHit(true);
					setGenericDoesHit(isFirstDidHit());
					runOpponentMove(opponentMove, calcOpponentTarget(opponentMove));
				}
				else
				{
					BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nThe attack missed the target", null);
					setFirstDidHit(false);
					setGenericDoesHit(isFirstDidHit());
				}
			}
			setFirstHasAttacked(true);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
			//Check if user can attack
			if(canAttack(getCurrentPokemonPlayer(), getPlayerMove()))
			{
				moveTextMod(getCurrentPokemonPlayer(), playerMove);
				if(doesHit(playerMove, getCurrentPokemonPlayer(), calcPlayerTarget(playerMove)))
				{
					setSecondDidHit(true);
					setGenericDoesHit(isSecondDidHit());
					runPlayerMove(playerMove, calcPlayerTarget(playerMove));
				}
				else
				{
					BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nThe attack missed the target", null);
					setSecondDidHit(false);
					setGenericDoesHit(isSecondDidHit());
				}
			}
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), opponentToPost, null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n-------------------", null);
//			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), playerToPost, null);
//			setBattleText(opponentMove, getCurrentPokemonOpponent(), calcOpponentTarget(opponentMove), getOpponentDamageToDeal(), isFirstDidHit());
//			setBattleText(playerMove, getCurrentPokemonPlayer(), calcPlayerTarget(playerMove), getPlayerDamageToDeal(), isSecondDidHit());
		}
		endOfTurn();
	}
	private static void moveTextMod(Pokemon pkmn, Move usedMove) throws BadLocationException {
		if(usedMove instanceof SolarBeam && !pkmn.getStatusVolatileBattle()[Status.TAKING_IN_SUNLIGHT])
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is taking in sunlight", null);
		}
		else if(usedMove instanceof Dig && !pkmn.getStatusVolatileBattle()[Status.SEMI_INVULNERABLE])
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" burrowed underground", null);
		}
		else if(usedMove instanceof SkullBash && !pkmn.getStatusVolatileBattle()[Status.WITHDRAWING])
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" lowered its head", null);
		}
		else if(usedMove instanceof Fly && !pkmn.getStatusVolatileBattle()[Status.SEMI_INVULNERABLE])
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" flew up high", null);
		}
		else if(usedMove instanceof SkyAttack && !pkmn.getStatusVolatileBattle()[Status.GLOWING])
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" was cloaked in a harsh light", null);
		}
		else
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" used "+usedMove.getName(), null);
		}
	}
	private static void endOfTurn() throws BadLocationException {
		statusHandler(getCurrentPokemonPlayer());
		statusHandler(getCurrentPokemonOpponent());
		handlerMist();
		statUpdater();
		setStatLabels();
		setPlayerDamageToDeal(0);
		setOpponentDamageToDeal(0);
		setFirstHasAttacked(false);
		setGenericDamageToDeal(0);
		setGenericMove(null);
		handlerLightScreen();
		handlerReflect();
		if(getCurrentPokemonPlayer().getCurrentHP() < 0)
		{
			getCurrentPokemonPlayer().setCurrentHP(0);
			getCurrentPokemonPlayer().setStatusNonVolatile(Status.FAINT);
		}
		if(getCurrentPokemonOpponent().getCurrentHP() < 0)
		{
			getCurrentPokemonOpponent().setCurrentHP(0);
			getCurrentPokemonOpponent().setStatusNonVolatile(Status.FAINT);
		}
	}
	private static void updateMoves(Move playerMoveHold, Move opponentMoveHold) {
		if(getCurrentPokemonPlayer().getForceMove() != null)
		{
			setPlayerMove(getCurrentPokemonPlayer().getForceMove());
		}
		else
		{
			setPlayerMove(playerMoveHold);
		}
		if(getCurrentPokemonOpponent().getForceMove() != null)
		{
			setOpponentMove(getCurrentPokemonOpponent().getForceMove());
		}
		else
		{
			setOpponentMove(opponentMoveHold);
		}
	}
	private static void handlerMist() throws BadLocationException {
		if(isMist())
		{
			if(getMistCounter() > 0)
			{
				setMistCounter(getMistCounter()-1);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nThe mist faded", null);
				setMist(false);
			}
		}
		if(isMist())
		{
			if(getCurrentPokemonPlayer().getStageAttack() != getPlayerStatChange()[ATTACK]
					|| getCurrentPokemonPlayer().getStageDefense() != getPlayerStatChange()[DEFENSE]
					|| getCurrentPokemonPlayer().getStageSpAttack() != getPlayerStatChange()[SP_ATTACK]
					|| getCurrentPokemonPlayer().getStageSpDefense() != getPlayerStatChange()[SP_DEFENSE]
					|| getCurrentPokemonPlayer().getStageSpeed() != getPlayerStatChange()[SPEED]
					|| getCurrentPokemonPlayer().getStageAccuracy() != getPlayerStatChange()[ACCURACY]
					|| getCurrentPokemonPlayer().getStageEvasion() != getPlayerStatChange()[EVASION])
			{
				getCurrentPokemonPlayer().setStageAttack(getPlayerStatChange()[ATTACK]);
				getCurrentPokemonPlayer().setStageDefense(getPlayerStatChange()[DEFENSE]);
				getCurrentPokemonPlayer().setStageSpAttack(getPlayerStatChange()[SP_ATTACK]);
				getCurrentPokemonPlayer().setStageSpDefense(getPlayerStatChange()[SP_DEFENSE]);
				getCurrentPokemonPlayer().setStageSpeed(getPlayerStatChange()[SPEED]);
				getCurrentPokemonPlayer().setStageAccuracy(getPlayerStatChange()[ACCURACY]);
				getCurrentPokemonPlayer().setStageEvasion(getPlayerStatChange()[EVASION]);
			}
			if(getCurrentPokemonOpponent().getStageAttack() != getOpponentStatChange()[ATTACK]
					|| getCurrentPokemonOpponent().getStageDefense() != getOpponentStatChange()[DEFENSE]
					|| getCurrentPokemonOpponent().getStageSpAttack() != getOpponentStatChange()[SP_ATTACK]
					|| getCurrentPokemonOpponent().getStageSpDefense() != getOpponentStatChange()[SP_DEFENSE]
					|| getCurrentPokemonOpponent().getStageSpeed() != getOpponentStatChange()[SPEED]
					|| getCurrentPokemonOpponent().getStageAccuracy() != getOpponentStatChange()[ACCURACY]
					|| getCurrentPokemonOpponent().getStageEvasion() != getOpponentStatChange()[EVASION])
			{
				getCurrentPokemonOpponent().setStageAttack(getOpponentStatChange()[ATTACK]);
				getCurrentPokemonOpponent().setStageDefense(getOpponentStatChange()[DEFENSE]);
				getCurrentPokemonOpponent().setStageSpAttack(getOpponentStatChange()[SP_ATTACK]);
				getCurrentPokemonOpponent().setStageSpDefense(getOpponentStatChange()[SP_DEFENSE]);
				getCurrentPokemonOpponent().setStageSpeed(getOpponentStatChange()[SPEED]);
				getCurrentPokemonOpponent().setStageAccuracy(getOpponentStatChange()[ACCURACY]);
				getCurrentPokemonOpponent().setStageEvasion(getOpponentStatChange()[EVASION]);
			}
		}
	}
	private static void handlerReflect() throws BadLocationException {
		if(isReflectPlayer())
		{
			if(getReflectCounterPlayer() > 0)
			{
				setReflectCounterPlayer(getReflectCounterPlayer()-1);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+getCurrentPokemonPlayer().getName()+"'s barrier faded", null);
				setReflectPlayer(false);
			}
		}
		
		if(isReflectOpponent())
		{
			if(getReflectCounterOpponent() > 0)
			{
				setReflectCounterOpponent(getReflectCounterOpponent()-1);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+getCurrentPokemonOpponent().getName()+"'s barrier faded", null);
				setReflectOpponent(false);
			}
		}
	}
	private static void handlerLightScreen() throws BadLocationException {
		if(isLightScreenPlayer())
		{
			if(getLightScreenCounterPlayer() > 0)
			{
				setLightScreenCounterPlayer(getLightScreenCounterPlayer()-1);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+getCurrentPokemonPlayer().getName()+"'s barrier faded", null);
				setLightScreenPlayer(false);
			}
		}
		
		if(isLightScreenOpponent())
		{
			if(getLightScreenCounterOpponent() > 0)
			{
				setLightScreenCounterOpponent(getLightScreenCounterOpponent()-1);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+getCurrentPokemonOpponent().getName()+"'s barrier faded", null);
				setLightScreenOpponent(false);
			}
		}
	}
	public static void setStatLabels()
	{
		BattleWindow.getLblPlayerAttack().setText("Attack: " + CurrentSimData.getCurrentPokemonPlayer().getStageAttack());
		BattleWindow.getLblPlayerDefense().setText("Defense: " + CurrentSimData.getCurrentPokemonPlayer().getStageDefense());
		BattleWindow.getLblPlayerSpAttack().setText("Special Attack: " + CurrentSimData.getCurrentPokemonPlayer().getStageSpAttack());
		BattleWindow.getLblPlayerSpDefense().setText("Special Defense: " + CurrentSimData.getCurrentPokemonPlayer().getStageSpDefense());
		BattleWindow.getLblPlayerSpeed().setText("Speed: " + CurrentSimData.getCurrentPokemonPlayer().getStageSpeed());
		BattleWindow.getLblPlayerAccuracy().setText("Accuracy: " + CurrentSimData.getCurrentPokemonPlayer().getStageAccuracy());
		BattleWindow.getLblPlayerEvasion().setText("Evasion: " + CurrentSimData.getCurrentPokemonPlayer().getStageEvasion());
		
		BattleWindow.getLblOpponentAttack().setText("Attack: " + CurrentSimData.getCurrentPokemonOpponent().getStageAttack());
		BattleWindow.getLblOpponentDefense().setText("Defense: " + CurrentSimData.getCurrentPokemonOpponent().getStageDefense());
		BattleWindow.getLblOpponentSpAttack().setText("Special Attack: " + CurrentSimData.getCurrentPokemonOpponent().getStageSpAttack());
		BattleWindow.getLblOpponentSpDefense().setText("Special Defense: " + CurrentSimData.getCurrentPokemonOpponent().getStageSpDefense());
		BattleWindow.getLblOpponentSpeed().setText("Speed: " + CurrentSimData.getCurrentPokemonOpponent().getStageSpeed());
		BattleWindow.getLblOpponentAccuracy().setText("Accuracy: " + CurrentSimData.getCurrentPokemonOpponent().getStageAccuracy());
		BattleWindow.getLblOpponentEvasion().setText("Evasion: " + CurrentSimData.getCurrentPokemonOpponent().getStageEvasion());
	}
	
	public static void statUpdater()
	{
		getPlayerStatChange()[ATTACK] = getCurrentPokemonPlayer().getStageAttack();
		getPlayerStatChange()[DEFENSE] = getCurrentPokemonPlayer().getStageDefense();
		getPlayerStatChange()[SP_ATTACK] = getCurrentPokemonPlayer().getStageSpAttack();
		getPlayerStatChange()[SP_DEFENSE] = getCurrentPokemonPlayer().getStageSpDefense();
		getPlayerStatChange()[SPEED] = getCurrentPokemonPlayer().getStageSpeed();
		getPlayerStatChange()[ACCURACY] = getCurrentPokemonPlayer().getStageAccuracy();
		getPlayerStatChange()[EVASION] = getCurrentPokemonPlayer().getStageEvasion();
		
		getOpponentStatChange()[ATTACK] = getCurrentPokemonOpponent().getStageAttack();
		getOpponentStatChange()[DEFENSE] = getCurrentPokemonOpponent().getStageDefense();
		getOpponentStatChange()[SP_ATTACK] = getCurrentPokemonOpponent().getStageSpAttack();
		getOpponentStatChange()[SP_DEFENSE] = getCurrentPokemonOpponent().getStageSpDefense();
		getOpponentStatChange()[SPEED] = getCurrentPokemonOpponent().getStageSpeed();
		getOpponentStatChange()[ACCURACY] = getCurrentPokemonOpponent().getStageAccuracy();
		getOpponentStatChange()[EVASION] = getCurrentPokemonOpponent().getStageEvasion();
	}
	
	public static void statusHandler(Pokemon pkmn) throws BadLocationException
	{
		try {
			if(pkmn.getStatusNonVolatile() != Status.NONE)
			{
				Status.snvBurn(pkmn);
				Status.snvPoison(pkmn);
				Status.snvBadlyPoisoned(pkmn);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pkmn == CurrentSimData.getCurrentPokemonPlayer())
		{
			switch(pkmn.getStatusNonVolatile())
			{
			case Status.FAINT: BattleWindow.getLblPlayerStatusNV().setText("FAINT");
			break;
			case Status.BURN: BattleWindow.getLblPlayerStatusNV().setText("BURN");
			break;
			case Status.FREEZE: BattleWindow.getLblPlayerStatusNV().setText("FREEZE");
			break;
			case Status.PARALYSIS: BattleWindow.getLblPlayerStatusNV().setText("PARALYSIS");
			break;
			case Status.POISON: BattleWindow.getLblPlayerStatusNV().setText("POISON");
			break;
			case Status.BADLY_POISONED: BattleWindow.getLblPlayerStatusNV().setText("BADLY_POISONED");
			break;
			default:
				break;
			}
		}
		if(pkmn == CurrentSimData.getCurrentPokemonOpponent())
		{
			switch(pkmn.getStatusNonVolatile())
			{
			case Status.FAINT: BattleWindow.getLblOpponentStatusNV().setText("FAINT");
			break;
			case Status.BURN: BattleWindow.getLblOpponentStatusNV().setText("BURN");
			break;
			case Status.FREEZE: BattleWindow.getLblOpponentStatusNV().setText("FREEZE");
			break;
			case Status.PARALYSIS: BattleWindow.getLblOpponentStatusNV().setText("PARALYSIS");
			break;
			case Status.POISON: BattleWindow.getLblOpponentStatusNV().setText("POISON");
			break;
			case Status.BADLY_POISONED: BattleWindow.getLblOpponentStatusNV().setText("BADLY_POISONED");
			break;
			default:
				break;
			}
		}
	}
	
	
	public static void effectivenessPrinter(Move usedMove, Pokemon target) throws BadLocationException
	{
		if(TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target)
			* TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType2(), target) >= 2)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nIt was ", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "Super Effective", TextStyles.getSupereffectiveStyle());
		}
		else if(TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target)
				* TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType2(), target) == 1)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "", null);
		}
		else if(TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target)
				* TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType2(), target) == 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nIt had ", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "no effect", TextStyles.getNoeffectStyle());
		}
		else if(TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target)
				* TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType2(), target) < 1)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nIt was ", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "Not Very Effective", TextStyles.getNotveryeffectiveStyle());
		}
	}
	
	public static void setBattleText(Move usedMove, Pokemon user, Pokemon target, int damageDealt, boolean didHit) throws BadLocationException
	{
		BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+user.getName()+" used "+usedMove.getName(), null);
		if(didHit)
		{
			if(usedMove.getCategory() == Move.STATUS)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"The attack was successful", null);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+"'s stats were changed", null);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"The attack hit the opponent", null);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"It inflicted " + damageDealt + " damage", null);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"Effectiveness was "
																							  + (TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType1(), target)
																							  * TypeTable.calcMultiplier(usedMove.getMoveType(), target.getType2(), target)), null);
			}
		}
		else
		{
			if(usedMove.getCategory() == Move.STATUS)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"The attack was unsuccessful", null);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+"'s stats were not changed", null);
			}
			else
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"The attack missed the opponent", null);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"It failed to inflict any damage", null);
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+"Effectiveness is 0", null);
			}
		}
	}

	public static void runPlayerMove(Move usedMove, Pokemon target) throws BadLocationException
	{
		setTimesToHit(1);
		usedMove.effectPre(getCurrentPokemonPlayer(), target);
		if(getGenericMove() != null)
		{
			setPlayerMove(getGenericMove());
		}
		boolean barrierBroken = handlerBrickBreakPlayer();
		if(getPlayerMove().getCategory() == Move.STATUS)
		{
			setPlayerDamageToDeal(0);
		}
		else
		{
			int i = 0;
			while(i < getTimesToHit())
			{
				setPlayerDamageToDeal(getPlayerDamageToDeal() + DamageCalc.calculate(getCurrentPokemonPlayer(), target, getPlayerMove()));
				i++;
			}
		}
		setGenericDamageToDeal(getPlayerDamageToDeal());

		handlerLightScreenReflectPlayer(getPlayerMove());
		
		getPlayerMove().effectPost(getCurrentPokemonPlayer(), target);
		
		
		
		if(isForceMove())
		{
			getCurrentPokemonPlayer().setForceMove(getPlayerMove());
		}
		else
		{
			getCurrentPokemonPlayer().setForceMove(null);
		}
		setPlayerDamageToDeal(getGenericDamageToDeal());
		if(getPlayerDamageToDeal() > 0)
		{
			dealDamage(target, getPlayerDamageToDeal());
			if(playerCrit)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nCritical hit", null);
			}
			if(getTimesToHit() != 1)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nHit "+getTimesToHit()+" times", null);
			}
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nIt did "+getPlayerDamageToDeal()+" damage", null);
			effectivenessPrinter(getPlayerMove(), target);
			if(barrierBroken)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+"'s barrier was broken", null);
			}
		}
		
		opponentStatChangeCheck();
		playerStatChangeCheck();
		statUpdater();
		
		target.setLastDamageTaken(getGenericDamageToDeal());
		setForceMove(false);
		setGenericMove(null);
		getCurrentPokemonPlayer().setLastMove(getPlayerMove()); //TODO Check this
		handlerRagePlayer();
		
		if(getGenericDamageToDeal() > 0 && target.isEnraged())
		{
			target.setStageAttack(target.getStageAttack()+1);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+"'s rage is growing (+1 Attack)", null);
		}
		//setBattleText(usedMove, getCurrentPokemonPlayer(), target, getPlayerDamageToDeal(), isGenericDoesHit());
		
		endOfMovePlayer(getPlayerMove());
	}
	private static void opponentStatChangeCheck() throws BadLocationException 
	{
		statValidator(getCurrentPokemonOpponent(), getOpponentMove());
		int attackChange = getOpponentStatChange()[ATTACK] - getCurrentPokemonOpponent().getStageAttack();
		int defenseChange = getOpponentStatChange()[DEFENSE] - getCurrentPokemonOpponent().getStageDefense();
		int spAttackChange = getOpponentStatChange()[SP_ATTACK] - getCurrentPokemonOpponent().getStageSpAttack();
		int spDefenseChange = getOpponentStatChange()[SP_DEFENSE] - getCurrentPokemonOpponent().getStageSpDefense();
		int speedChange = getOpponentStatChange()[SPEED] - getCurrentPokemonOpponent().getStageSpeed();
		int accuracyChange = getOpponentStatChange()[ACCURACY] - getCurrentPokemonOpponent().getStageAccuracy();
		int evasionChange = getOpponentStatChange()[EVASION] - getCurrentPokemonOpponent().getStageEvasion();
		
		statChangeText(getCurrentPokemonOpponent(), attackChange, defenseChange, spAttackChange, spDefenseChange, speedChange, accuracyChange, evasionChange);
	}
	private static void playerStatChangeCheck() throws BadLocationException 
	{

		statValidator(getCurrentPokemonPlayer(), getPlayerMove());
		int attackChange = getPlayerStatChange()[ATTACK] - getCurrentPokemonPlayer().getStageAttack();
		int defenseChange = getPlayerStatChange()[DEFENSE] - getCurrentPokemonPlayer().getStageDefense();
		int spAttackChange = getPlayerStatChange()[SP_ATTACK] - getCurrentPokemonPlayer().getStageSpAttack();
		int spDefenseChange = getPlayerStatChange()[SP_DEFENSE] - getCurrentPokemonPlayer().getStageSpDefense();
		int speedChange = getPlayerStatChange()[SPEED] - getCurrentPokemonPlayer().getStageSpeed();
		int accuracyChange = getPlayerStatChange()[ACCURACY] - getCurrentPokemonPlayer().getStageAccuracy();
		int evasionChange = getPlayerStatChange()[EVASION] - getCurrentPokemonPlayer().getStageEvasion();
		
		statChangeText(getCurrentPokemonPlayer(), attackChange, defenseChange, spAttackChange, spDefenseChange, speedChange, accuracyChange, evasionChange);
	}
	private static void statChangeText(Pokemon pkmn, int attackChange, int defenseChange, int spAttackChange, int spDefenseChange, int speedChange, int accuracyChange, int evasionChange) throws BadLocationException
	{
		if(attackChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Attack", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(attackChange), null);
		}
		else if(attackChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Attack", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(attackChange), null);

		}
		
		if(defenseChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Defense", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(defenseChange), null);
		}
		else if(defenseChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Defense", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(defenseChange), null);

		}
		
		if(spAttackChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Special Attack", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(spAttackChange), null);
		}
		else if(spAttackChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Special Attack", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(spAttackChange), null);

		}
		
		if(spDefenseChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Special Defense", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(spDefenseChange), null);
		}
		else if(spDefenseChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Special Defense", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(spDefenseChange), null);

		}
		
		if(speedChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Speed", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(speedChange), null);
		}
		else if(speedChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Speed", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(speedChange), null);

		}
		
		if(accuracyChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Accuracy", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(accuracyChange), null);
		}
		else if(accuracyChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Accuracy", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(accuracyChange), null);

		}
		
		if(evasionChange > 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Evasion", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " decreased ", TextStyles.getStatDecreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(evasionChange), null);
		}
		else if(evasionChange < 0)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName() +"'s Evasion", null);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), " increased ", TextStyles.getStatIncreaseStyle());
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "by " + Math.abs(evasionChange), null);

		}
	}
	private static void statValidator(Pokemon pkmn, Move usedMove) throws BadLocationException 
	{
		boolean fail = false;
		if(pkmn.getStageAttack() > 6)
		{
			pkmn.setStageAttack(6);
			fail = true;
		}
		else if(pkmn.getStageAttack() < -6)
		{
			pkmn.setStageAttack(-6);
			fail = true;
		}
		if(pkmn.getStageDefense() > 6)
		{
			pkmn.setStageDefense(6);
			fail = true;
		}
		else if(pkmn.getStageDefense() < -6)
		{
			pkmn.setStageDefense(-6);
			fail = true;
		}
		if(pkmn.getStageSpAttack() > 6)
		{
			pkmn.setStageSpAttack(6);
			fail = true;
		}
		else if(pkmn.getStageSpAttack() < -6)
		{
			pkmn.setStageSpAttack(-6);
			fail = true;
		}
		if(pkmn.getStageSpDefense() > 6)
		{
			pkmn.setStageSpDefense(6);
			fail = true;
		}
		else if(pkmn.getStageSpDefense() < -6)
		{
			pkmn.setStageSpDefense(-6);
			fail = true;
		}
		if(pkmn.getStageSpeed() > 6)
		{
			pkmn.setStageSpeed(6);
			fail = true;
		}
		else if(pkmn.getStageSpeed() < -6)
		{
			pkmn.setStageSpeed(-6);
			fail = true;
		}
		if(pkmn.getStageAccuracy() > 6)
		{
			pkmn.setStageAccuracy(6);
			fail = true;
		}
		else if(pkmn.getStageAccuracy() < -6)
		{
			pkmn.setStageAccuracy(-6);
			fail = true;
		}
		if(pkmn.getStageEvasion() > 6)
		{
			pkmn.setStageEvasion(6);
			fail = true;
		}
		else if(pkmn.getStageEvasion() < -6)
		{
			pkmn.setStageEvasion(-6);
			fail = true;
		}
		
		if(fail && usedMove.getCategory() == Move.STATUS)
		{
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nBut it failed", null);
		}
	}
	private static boolean handlerBrickBreakPlayer() {
		if(getPlayerMove() instanceof BrickBreak)
		{
			if(isLightScreenOpponent())
			{
				setLightScreenOpponent(false);
				setLightScreenCounterOpponent(0);
				return true;
			}
			if(isReflectOpponent())
			{
				setReflectOpponent(false);
				setReflectCounterOpponent(0);
				return true;
			}
		}
		return false;
	}
	private static void handlerRagePlayer() {
		if(getCurrentPokemonPlayer().getLastMove() instanceof Rage && isGenericDoesHit())
		{
			getCurrentPokemonPlayer().setEnraged(true);
		}
		else
		{
			getCurrentPokemonPlayer().setEnraged(false);
		}
	}
	private static void handlerLightScreenReflectPlayer(Move usedMove) {
		if(isLightScreenOpponent() && usedMove.getCategory() == Move.SPECIAL)
		{
			setGenericDamageToDeal(getGenericDamageToDeal()/2);
		}
		
		if(isReflectOpponent() && usedMove.getCategory() == Move.PHYSICAL)
		{
			setGenericDamageToDeal(getGenericDamageToDeal()/2);
		}
	}
	private static void endOfMovePlayer(Move usedMove) {
		if(usedMove instanceof Mist && !isMist())
		{
			setMist(true);
			setMistCounter(5);
		}
		
		if(usedMove instanceof LightScreen && !isLightScreenPlayer())
		{
			setLightScreenPlayer(true);
			setLightScreenCounterPlayer(5);
		}
		
		if(usedMove instanceof Reflect && !isReflectPlayer())
		{
			setReflectPlayer(true);
			setReflectCounterPlayer(5);
		}
		
		usedMove.subtractPP();
	}
	
	public static void runOpponentMove(Move usedMove, Pokemon target) throws BadLocationException
	{
		setTimesToHit(1);
		usedMove.effectPre(getCurrentPokemonOpponent(), target);
		if(getGenericMove() != null)
		{
			setOpponentMove(getGenericMove());
		}
		boolean barrierBroken = handlerBrickBreakOpponent();
		if(getOpponentMove().getCategory() == Move.STATUS)
		{
			setOpponentDamageToDeal(0);
		}
		else
		{
			int i = 0;
			while(i < getTimesToHit())
			{
				setOpponentDamageToDeal(getOpponentDamageToDeal() + DamageCalc.calculate(getCurrentPokemonOpponent(), target, getOpponentMove()));
				i++;
			}
		}
		setGenericDamageToDeal(getOpponentDamageToDeal());
		handlerLightScreenReflectOpponent(getOpponentMove());
		getOpponentMove().effectPost(getCurrentPokemonOpponent(), target);
		
		
		if(isForceMove())
		{
			getCurrentPokemonOpponent().setForceMove(getOpponentMove());
		}
		else
		{
			getCurrentPokemonOpponent().setForceMove(null);
		}
		setOpponentDamageToDeal(getGenericDamageToDeal());
		if(getOpponentDamageToDeal() > 0)
		{
			dealDamage(target, getOpponentDamageToDeal());
			if(opponentCrit)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nCritical hit", null);
			}
			if(getTimesToHit() != 1)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nHit "+getTimesToHit()+" times", null);
			}
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\nIt did "+getOpponentDamageToDeal()+" damage", null);
			effectivenessPrinter(getOpponentMove(), target);
			if(barrierBroken)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+"'s barrier was broken", null);
			}
		}
		playerStatChangeCheck();
		opponentStatChangeCheck();
		statUpdater();
		target.setLastDamageTaken(getGenericDamageToDeal());
		setForceMove(false);
		setGenericMove(null);
		getCurrentPokemonOpponent().setLastMove(getOpponentMove());
		handlerRageOpponent();
		if(getGenericDamageToDeal() > 0 && target.isEnraged())
		{
			target.setStageAttack(target.getStageAttack()+1);
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+target.getName()+"'s rage is growing (+1 Attack)", null);
		}
		
		//setBattleText(usedMove, getCurrentPokemonOpponent(), target, getOpponentDamageToDeal(), isGenericDoesHit());
		endOfMoveOpponent(getOpponentMove());
	}
	private static boolean handlerBrickBreakOpponent() {
		if(getOpponentMove() instanceof BrickBreak)
		{
			if(isLightScreenPlayer())
			{
				setLightScreenPlayer(false);
				setLightScreenCounterPlayer(0);
				return true;
			}
			if(isReflectPlayer())
			{
				setReflectPlayer(false);
				setReflectCounterPlayer(0);
				return true;
			}
		}
		return false;
	}
	private static void handlerRageOpponent() {
		if(getCurrentPokemonOpponent().getLastMove() instanceof Rage && isGenericDoesHit())
		{
			getCurrentPokemonOpponent().setEnraged(true);
		}
		else
		{
			getCurrentPokemonOpponent().setEnraged(false);
		}
	}
	private static void handlerLightScreenReflectOpponent(Move usedMove) {
		if(isLightScreenPlayer() && usedMove.getCategory() == Move.SPECIAL)
		{
			setGenericDamageToDeal(getGenericDamageToDeal()/2);
		}
		
		if(isReflectPlayer() && usedMove.getCategory() == Move.PHYSICAL)
		{
			setGenericDamageToDeal(getGenericDamageToDeal()/2);
		}
	}
	private static void endOfMoveOpponent(Move usedMove) {
		if(usedMove instanceof Mist && !isMist())
		{
			setMist(true);
			setMistCounter(5);
		}
		
		if(usedMove instanceof LightScreen && !isLightScreenOpponent())
		{
			setLightScreenOpponent(true);
			setLightScreenCounterOpponent(5);
		}
		
		if(usedMove instanceof Reflect && !isReflectOpponent())
		{
			setReflectOpponent(true);
			setReflectCounterOpponent(5);
		}
		usedMove.subtractPP();
	}
	
	public static void dealDamage(Pokemon pkmn, int damageToDeal)
	{
		pkmn.setCurrentHP(pkmn.getCurrentHP()-damageToDeal);
	}
	public static boolean doesHit(Move usedMove, Pokemon user, Pokemon target)
	{
		//TODO add checks for statuses etc
		//TODO add semi-invulnerability checks
		setCalculatedAccuracy(accuracyCheck(usedMove, user, target));
		if(usedMove.getAccuracy() != 0)
		{
			if(ThreadLocalRandom.current().nextDouble() 
					>= 1.0-Status.svbTakingAim(user, getCalculatedAccuracy()))
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
			if(target.getStatusVolatileBattle()[Status.SEMI_INVULNERABLE])
			{
				if(Status.svbSemiInvulnerable(user, target, usedMove))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			return true;
		}
	}
	
	public static double accuracyCheck(Move usedMove, Pokemon user, Pokemon target)
	{
		return ((double) usedMove.getAccuracy()/100) 
			 * (calcStage(user.getStageAccuracy())
			 / calcStage(target.getStageEvasion()));
	}
	/*
	 * Determine who attacks first
	 */
	public static void calcMoveOrder(Move playerMove, Move opponentMove)
	{
		if(playerMove.getPriority() != opponentMove.getPriority())
		{
			/*
			 * Move priority overrides Pokemon speed
			 */
			if(playerMove.getPriority() > opponentMove.getPriority())
			{
				setFirstAttack(PLAYER);
			}
			else if(playerMove.getPriority() < opponentMove.getPriority())
			{
				setFirstAttack(OPPONENT);
			}
		}
		else
		{
			if(calcEffectiveSpeedPlayer() > calcEffectiveSpeedOpponent())
			{
				setFirstAttack(PLAYER);
			}
			else if(calcEffectiveSpeedPlayer() < calcEffectiveSpeedOpponent())
			{
				setFirstAttack(OPPONENT);
			}
			else
			{
				setFirstAttack(ThreadLocalRandom.current().nextInt(1));
			}
		}
	}
	
	/*
	 * Determine if Pokemon can attack based on status conditions
	 */
	public static boolean canAttack(Pokemon pkmn, Move usedMove) throws BadLocationException
	{
		if(pkmn.getCurrentHP() <= 0)
		{
			pkmn.setStatusNonVolatile(Status.FAINT);
		}
		if(pkmn.getStatusNonVolatile() == Status.FAINT)
		{
			if(pkmn.getStatusVolatileBattle()[Status.SUBSTITUTE])
			{
				//TODO finish once backup is implemented
				return true;
			}
			BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" fainted and couldn't attack", null);
			return false;
		}
		Status.snvFreeze(pkmn);
		if(pkmn.getStatusNonVolatile() != Status.NONE)
		{
			if(pkmn.getStatusNonVolatile() == Status.FREEZE)
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is frozen", null);
				return false;
			}
			else if(!Status.snvParalysis(pkmn))
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is paralyzed, it can't attack", null);

				return false;
			}
			else if(!Status.snvSleep(pkmn))
			{
				BattleWindow.battleText.insertString(BattleWindow.battleText.getLength(), "\n"+pkmn.getName()+" is asleep", null);

				return false;
			}
		}
		
		
		if(!Status.svConfusion(pkmn))
		{
			return false;
		}
		if(!Status.svFlinch(pkmn))
		{
			return false;
		}
		if(!Status.svInfatuation(pkmn))
		{
			return false;
		}
		
		if(!Status.svbRecharging(pkmn))
		{
			return false;
		}
		
		if(usedMove.isDisabled)
		{
			return false;
		}
		return true;
	}
	/*
	 * Calculate current speed value for the player
	 */
	public static double calcEffectiveSpeedPlayer()
	{
		return getCurrentPokemonPlayer().getSpeed()
				*Status.paralysisSpeed(getCurrentPokemonPlayer())
				*calcStage(getCurrentPokemonPlayer().getStageSpeed());
	}
	/*
	 * Calculate current speed value for the opponent
	 */
	public static double calcEffectiveSpeedOpponent()
	{
		return getCurrentPokemonOpponent().getSpeed()
				*Status.paralysisSpeed(getCurrentPokemonOpponent())
				*calcStage(getCurrentPokemonOpponent().getStageSpeed());
	}
	
	/*
	 * Calculate current stage multiplier
	 */
	public static double calcStage(int stage)
	{
		if(stage >= 0)
		{
			return stage*.5+1;
		}
		else
		{
			if(stage == -6)
			{
				return .25;
			}
			else if(stage == -5)
			{
				return .285;
			}
			else if(stage == -4)
			{
				return .333;
			}
			else if(stage == -3)
			{
				return .4;
			}
			else if(stage == -2)
			{
				return .5;
			}
			else if(stage == -1)
			{
				return .666;
			}
		}
		return 1;
	}

	public static Pokemon calcPlayerTarget(Move usedMove)
	{
		if(usedMove.getCategory() == Move.PHYSICAL || usedMove.getCategory() == Move.SPECIAL)
		{
			return getCurrentPokemonOpponent();
		}
		else if(usedMove.getCategory() == Move.STATUS)
		{
			if(usedMove.isSnatch())
			{
				return getCurrentPokemonPlayer();
			}
			else
			{
				return getCurrentPokemonOpponent();
			}
		}
		else
		{
			//Something went very wrong
			return null;
		}
	}
	
	public static Pokemon calcOpponentTarget(Move usedMove)
	{
		if(usedMove.getCategory() == Move.PHYSICAL || usedMove.getCategory() == Move.SPECIAL)
		{
			return getCurrentPokemonPlayer();
		}
		else if(usedMove.getCategory() == Move.STATUS)
		{
			if(usedMove.isSnatch())
			{
				return getCurrentPokemonOpponent();
			}
			else
			{
				return getCurrentPokemonPlayer();
			}
		}
		else
		{
			//Something went very wrong
			return null;
		}
	}
	
	public static void heal(Pokemon pkmn, int toHeal)
	{
		pkmn.setCurrentHP(pkmn.getCurrentHP() + toHeal);
	}
	
	
	public static void switchPlayer(int toSwitch)
	{
		CurrentSimData.setCurrentPokemonPlayer(toSwitch);
	}
	
	public static void switchOpponent(int toSwitch)
	{
		CurrentSimData.setCurrentPokemonOpponent(toSwitch);
	}
	
	public static int getFirstAttack() {
		return firstAttack;
	}

	public static void setFirstAttack(int firstAttack) {
		BattleHandler.firstAttack = firstAttack;
	}

	public static Pokemon getCurrentPokemonPlayer()
	{
		return CurrentSimData.getCurrentPokemonPlayer();
	}
	
	public static Pokemon getCurrentPokemonOpponent()
	{
		return CurrentSimData.getCurrentPokemonOpponent();
	}

	public static int getPlayerDamageToDeal() {
		return playerDamageToDeal;
	}

	public static void setPlayerDamageToDeal(int playerDamageToDeal) {
		BattleHandler.playerDamageToDeal = playerDamageToDeal;
	}

	public static int getOpponentDamageToDeal() {
		return opponentDamageToDeal;
	}

	public static void setOpponentDamageToDeal(int opponentDamageToDeal) {
		BattleHandler.opponentDamageToDeal = opponentDamageToDeal;
	}

	public static boolean isFirstDidHit() {
		return firstDidHit;
	}

	public static void setFirstDidHit(boolean firstDidHit) {
		BattleHandler.firstDidHit = firstDidHit;
	}

	public static boolean isSecondDidHit() {
		return secondDidHit;
	}

	public static void setSecondDidHit(boolean secondDidHit) {
		BattleHandler.secondDidHit = secondDidHit;
	}

	public static int[] getPlayerStatChange() {
		return playerStatChange;
	}

	public static void setPlayerStatChange(int[] playerStatChange) {
		BattleHandler.playerStatChange = playerStatChange;
	}

	public static int[] getOpponentStatChange() {
		return opponentStatChange;
	}

	public static void setOpponentStatChange(int[] opponentStatChange) {
		BattleHandler.opponentStatChange = opponentStatChange;
	}
	public static int getTimesToHit() {
		return timesToHit;
	}
	public static void setTimesToHit(int timesToHit) {
		BattleHandler.timesToHit = timesToHit;
	}
	public static boolean isFirstHasAttacked() {
		return firstHasAttacked;
	}
	public static void setFirstHasAttacked(boolean firstHasAttacked) {
		BattleHandler.firstHasAttacked = firstHasAttacked;
	}
	public static int getGenericDamageToDeal() {
		return genericDamageToDeal;
	}
	public static void setGenericDamageToDeal(int genericDamageToDeal) {
		BattleHandler.genericDamageToDeal = genericDamageToDeal;
	}
	public static boolean isGenericDoesHit() {
		return genericDoesHit;
	}
	public static void setGenericDoesHit(boolean genericDoesHit) {
		BattleHandler.genericDoesHit = genericDoesHit;
	}
	public static double getCalculatedAccuracy() {
		return calculatedAccuracy;
	}
	public static void setCalculatedAccuracy(double calculatedAccuracy) {
		BattleHandler.calculatedAccuracy = calculatedAccuracy;
	}
	public static boolean isForceMove() {
		return forceMove;
	}
	public static void setForceMove(boolean forceMove) {
		BattleHandler.forceMove = forceMove;
	}
	public static Move getPlayerMove() {
		return playerMove;
	}
	public static void setPlayerMove(Move playerMove) {
		BattleHandler.playerMove = playerMove;
	}
	public static Move getOpponentMove() {
		return opponentMove;
	}
	public static void setOpponentMove(Move opponentMove) {
		BattleHandler.opponentMove = opponentMove;
	}
	public static Move getGenericMove() {
		return genericMove;
	}
	public static void setGenericMove(Move genericMove) {
		BattleHandler.genericMove = genericMove;
	}
	public static boolean isMist() {
		return mist;
	}
	public static void setMist(boolean mist) {
		BattleHandler.mist = mist;
	}
	public static int getMistCounter() {
		return mistCounter;
	}
	public static void setMistCounter(int mistCounter) {
		BattleHandler.mistCounter = mistCounter;
	}
	public static boolean isLightScreenPlayer() {
		return lightScreenPlayer;
	}
	public static void setLightScreenPlayer(boolean lightScreenPlayer) {
		BattleHandler.lightScreenPlayer = lightScreenPlayer;
	}
	public static boolean isLightScreenOpponent() {
		return lightScreenOpponent;
	}
	public static void setLightScreenOpponent(boolean lightScreenOpponent) {
		BattleHandler.lightScreenOpponent = lightScreenOpponent;
	}
	public static int getLightScreenCounterPlayer() {
		return lightScreenCounterPlayer;
	}
	public static void setLightScreenCounterPlayer(int lightScreenCounterPlayer) {
		BattleHandler.lightScreenCounterPlayer = lightScreenCounterPlayer;
	}
	public static int getLightScreenCounterOpponent() {
		return lightScreenCounterOpponent;
	}
	public static void setLightScreenCounterOpponent(int lightScreenCounterOpponent) {
		BattleHandler.lightScreenCounterOpponent = lightScreenCounterOpponent;
	}
	public static boolean isReflectPlayer() {
		return reflectPlayer;
	}
	public static void setReflectPlayer(boolean reflectPlayer) {
		BattleHandler.reflectPlayer = reflectPlayer;
	}
	public static boolean isReflectOpponent() {
		return reflectOpponent;
	}
	public static void setReflectOpponent(boolean reflectOpponent) {
		BattleHandler.reflectOpponent = reflectOpponent;
	}
	public static int getReflectCounterPlayer() {
		return reflectCounterPlayer;
	}
	public static void setReflectCounterPlayer(int reflectCounterPlayer) {
		BattleHandler.reflectCounterPlayer = reflectCounterPlayer;
	}
	public static int getReflectCounterOpponent() {
		return reflectCounterOpponent;
	}
	public static void setReflectCounterOpponent(int reflectCounterOpponent) {
		BattleHandler.reflectCounterOpponent = reflectCounterOpponent;
	}
	public static boolean isPlayerCrit() {
		return playerCrit;
	}
	public static void setPlayerCrit(boolean playerCrit) {
		BattleHandler.playerCrit = playerCrit;
	}
	public static boolean isOpponentCrit() {
		return opponentCrit;
	}
	public static void setOpponentCrit(boolean opponentCrit) {
		BattleHandler.opponentCrit = opponentCrit;
	}
}
