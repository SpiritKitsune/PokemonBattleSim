package pokemondata;

import core.*;

public class Machop extends Pokemon
{
	public Machop() 
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
	static String name = "Machop";
	String sprite = "machop1.png";
	static int type1 = TypeTable.FIGHTING;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.BULK_UP.ordinal(),
		Names.moveNames.BULLDOZE.ordinal(),
		Names.moveNames.BULLET_PUNCH.ordinal(),
		Names.moveNames.CLOSE_COMBAT.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.COUNTER.ordinal(),
		Names.moveNames.CROSS_CHOP.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DUAL_CHOP.ordinal(),
		Names.moveNames.DYNAMIC_PUNCH.ordinal(),
		Names.moveNames.EARTHQUAKE.ordinal(),
		Names.moveNames.ENCORE.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FIRE_BLAST.ordinal(),
		Names.moveNames.FIRE_PUNCH.ordinal(),
		Names.moveNames.FLAMETHROWER.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FOCUS_BLAST.ordinal(),
		Names.moveNames.FOCUS_ENERGY.ordinal(),
		Names.moveNames.FORESIGHT.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.HEAVY_SLAM.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.ICE_PUNCH.ordinal(),
		Names.moveNames.KARATE_CHOP.ordinal(),
		Names.moveNames.KNOCK_OFF.ordinal(),
		Names.moveNames.LEER.ordinal(),
		Names.moveNames.LIGHT_SCREEN.ordinal(),
		Names.moveNames.LOW_KICK.ordinal(),
		Names.moveNames.LOW_SWEEP.ordinal(),
		Names.moveNames.MEDITATE.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.POISON_JAB.ordinal(),
		Names.moveNames.POWER_TRICK.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.QUICK_GUARD.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.REVENGE.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROLLING_KICK.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SCARY_FACE.ordinal(),
		Names.moveNames.SEISMIC_TOSS.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.SMELLING_SALTS.ordinal(),
		Names.moveNames.SUBMISSION.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER_PUNCH.ordinal(),
		Names.moveNames.TICKLE.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.VITAL_THROW.ordinal(),
		Names.moveNames.WAKE_UP_SLAP.ordinal(),
		Names.moveNames.WORK_UP.ordinal()
		};
	
	double baseHp = 70;
	double baseAttack = 80;
	double baseDefense = 50;
	double baseSpAttack = 35;
	double baseSpDefense = 35;
	double baseSpeed = 35;

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
	double weight = 19.5; //in kg
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
