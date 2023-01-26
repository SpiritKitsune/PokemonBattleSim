package pokemondata;

import core.*;

public class Omanyte extends Pokemon
{
	public Omanyte() 
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
	static String name = "Omanyte";
	String sprite = "omanyte1.png";
	static int type1 = TypeTable.ROCK;
	static int type2 = TypeTable.WATER;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ANCIENT_POWER.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.AURORA_BEAM.ordinal(),
		Names.moveNames.BIDE.ordinal(),
		Names.moveNames.BITE.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BRINE.ordinal(),
		Names.moveNames.BUBBLE_BEAM.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CONSTRICT.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GYRO_BALL.ordinal(),
		Names.moveNames.HAIL.ordinal(),
		Names.moveNames.HAZE.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYDRO_PUMP.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.KNOCK_OFF.ordinal(),
		Names.moveNames.LEER.ordinal(),
		Names.moveNames.MUD_SHOT.ordinal(),
		Names.moveNames.MUDDY_WATER.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REFLECT_TYPE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROCK_BLAST.ordinal(),
		Names.moveNames.ROCK_POLISH.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROLLOUT.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SCALD.ordinal(),
		Names.moveNames.SHELL_SMASH.ordinal(),
		Names.moveNames.SLAM.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.SPIKES.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUPERSONIC.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.TICKLE.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TOXIC_SPIKES.ordinal(),
		Names.moveNames.WATER_GUN.ordinal(),
		Names.moveNames.WATER_PULSE.ordinal(),
		Names.moveNames.WATERFALL.ordinal(),
		Names.moveNames.WHIRLPOOL.ordinal(),
		Names.moveNames.WITHDRAW.ordinal(),
		Names.moveNames.WRING_OUT.ordinal()
		};
	
	double baseHp = 35;
	double baseAttack = 40;
	double baseDefense = 100;
	double baseSpAttack = 90;
	double baseSpDefense = 55;
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
	double weight = 7.5; //in kg
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