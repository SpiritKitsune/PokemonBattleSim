package pokemondata;

import core.*;

public class Kadabra extends Pokemon
{
	public Kadabra() 
	{
		setName(name);
		setType1(type1);
		setType2(type2);
		setLevel(level);
		setAttack(attack);
		setDefense(defense);
		setSpAttack(spAttack);
		setSpDefense(spDefense);
		setSpeed(speed);
		setHp(hp);
		setAccuracy(accuracy);
		setStatusNonVolatile(statusNonVolatile);
		setStatusVolatile(statusVolatile);
		setStatusVolatileBattle(statusVolatileBattle);
		setCurrentHP(currentHP);
		setCritLevel(critLevel);
		setStageHP(stageHP);
		setStageAttack(stageAttack);
		setStageDefense(stageDefense);
		setStageSpAttack(stageSpAttack);
		setStageSpDefense(stageSpDefense);
		setStageSpeed(stageSpeed);
		setStageAccuracy(stageAccuracy);
		setStageEvasion(stageEvasion);
		setWeight(weight);
		setGender(gender);
		setMoveSet(moveSet);
		setBpCounter(bpCounter);
		setSleepCounter(sleepCounter);
		setBoundCounter(boundCounter);
		setConfusionCounter(confusionCounter);
		setEmbargoCounter(embargoCounter);
		setHealBlockCounter(healBlockCounter);
		setPerishSongCounter(perishSongCounter);
		setTauntCounter(tauntCounter);
		setLastDamageTaken(lastDamageTaken);
		setBideCounter(bideCounter);
		setLastMove(lastMove);
		setValidMoves(validMoves);
		setIvAttack(ivAttack);
		setIvDefense(ivDefense);
		setIvSpAttack(ivSpAttack);
		setIvSpDefense(ivSpDefense);
		setIvSpeed(ivSpeed);
		setIvHp(ivHp);
		setEvAttack(evAttack);
		setEvDefense(evDefense);
		setEvHp(evHp);
		setEvSpAttack(evSpAttack);
		setEvSpDefense(evSpDefense);
		setEvSpeed(evSpeed);
		setBaseAttack(baseAttack);
		setBaseDefense(baseDefense);
		setBaseHp(baseHp);
		setBaseSpAttack(baseSpAttack);
		setBaseSpDefense(baseSpDefense);
		setBaseSpeed(baseSpeed);
		setNature(nature);
	}
	static String name = "Kadabra";
	String sprite = "kadabra1.png";
	static int type1 = TypeTable.PSYCHIC;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ALLY_SWITCH.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BARRIER.ordinal(),
		Names.moveNames.CALM_MIND.ordinal(),
		Names.moveNames.CHARGE_BEAM.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CONFUSION.ordinal(),
		Names.moveNames.DAZZLING_GLEAM.ordinal(),
		Names.moveNames.DISABLE.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DREAM_EATER.ordinal(),
		Names.moveNames.EMBARGO.ordinal(),
		Names.moveNames.ENCORE.ordinal(),
		Names.moveNames.ENERGY_BALL.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FIRE_PUNCH.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.FUTURE_SIGHT.ordinal(),
		Names.moveNames.GRASS_KNOT.ordinal(),
		Names.moveNames.GUARD_SPLIT.ordinal(),
		Names.moveNames.GUARD_SWAP.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.ICE_PUNCH.ordinal(),
		Names.moveNames.KINESIS.ordinal(),
		Names.moveNames.KNOCK_OFF.ordinal(),
		Names.moveNames.LIGHT_SCREEN.ordinal(),
		Names.moveNames.MIRACLE_EYE.ordinal(),
		Names.moveNames.POWER_TRICK.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYBEAM.ordinal(),
		Names.moveNames.PSYCH_UP.ordinal(),
		Names.moveNames.PSYCHIC.ordinal(),
		Names.moveNames.PSYCHO_CUT.ordinal(),
		Names.moveNames.PSYCHO_SHIFT.ordinal(),
		Names.moveNames.PSYSHOCK.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.RECOVER.ordinal(),
		Names.moveNames.REFLECT.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROLE_PLAY.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SAFEGUARD.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SKILL_SWAP.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.TELEKINESIS.ordinal(),
		Names.moveNames.TELEPORT.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER_PUNCH.ordinal(),
		Names.moveNames.THUNDER_WAVE.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TRICK.ordinal(),
		Names.moveNames.TRICK_ROOM.ordinal()
		};
	
	double baseHp = 40;
	double baseAttack = 35;
	double baseDefense = 30;
	double baseSpAttack = 120;
	double baseSpDefense = 70;
	double baseSpeed = 105;

	double level = 1;
	
	int attack = 0;
	int defense = 0;
	int spAttack = 0;
	int spDefense = 0;
	int speed = 0;
	int hp = 0;
	
	double ivAttack = 1;
	double ivDefense = 1;
	double ivSpAttack = 1;
	double ivSpDefense = 1;
	double ivSpeed = 1;
	double ivHp = 1;
	
	double evAttack = 0;
	double evDefense = 0;
	double evSpAttack = 0;
	double evSpDefense = 0;
	double evSpeed = 0;
	double evHp = 0;
	
	int nature = 0;

	double accuracy;
	int statusNonVolatile = Status.NONE;
	boolean[] statusVolatile = new boolean[17];
	boolean[] statusVolatileBattle = new boolean[19];
	double currentHP = hp;
	double critLevel = DamageCalc.CRIT_0;
	
	int stageHP = 0;
	int stageAttack = 0;
	int stageDefense = 0;
	int stageSpAttack = 0;
	int stageSpDefense = 0;
	int stageSpeed = 0;
	int stageAccuracy = 0;
	int stageEvasion = 0;
	double weight = 56.5; //in kg
	int gender = 0;
	
	Move[] moveSet = new Move[4];
	int bpCounter = 0;
	int sleepCounter = 0;
	int boundCounter = 0;
	int confusionCounter = 0;
	int embargoCounter = 0;
	int healBlockCounter = 0;
	int perishSongCounter = 4;
	int tauntCounter = 3;
	int lastDamageTaken = 0;
	int bideCounter = 0;
	
	Move lastMove;

}
