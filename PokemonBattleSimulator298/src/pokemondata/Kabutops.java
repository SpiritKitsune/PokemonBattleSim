package pokemondata;

import core.*;

public class Kabutops extends Pokemon
{
	public Kabutops() 
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
	static String name = "Kabutops";
	String sprite = "kabutops1.png";
	static int type1 = TypeTable.ROCK;
	static int type2 = TypeTable.WATER;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ABSORB.ordinal(),
		Names.moveNames.AERIAL_ACE.ordinal(),
		Names.moveNames.ANCIENT_POWER.ordinal(),
		Names.moveNames.AQUA_JET.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.AURORA_BEAM.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.BUBBLE_BEAM.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CONFUSE_RAY.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.ENDURE.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FEINT.ordinal(),
		Names.moveNames.FLAIL.ordinal(),
		Names.moveNames.FORESIGHT.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GIGA_DRAIN.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.HAIL.ordinal(),
		Names.moveNames.HARDEN.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.ICY_WIND.ordinal(),
		Names.moveNames.KNOCK_OFF.ordinal(),
		Names.moveNames.LEER.ordinal(),
		Names.moveNames.MEGA_DRAIN.ordinal(),
		Names.moveNames.METAL_SOUND.ordinal(),
		Names.moveNames.MUD_SHOT.ordinal(),
		Names.moveNames.NATURE_POWER.ordinal(),
		Names.moveNames.NIGHT_SLASH.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.RAPID_SPIN.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROCK_POLISH.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SAND_ATTACK.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SCALD.ordinal(),
		Names.moveNames.SCRATCH.ordinal(),
		Names.moveNames.SCREECH.ordinal(),
		Names.moveNames.SLASH.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.STONE_EDGE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.TAKE_DOWN.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.WATERFALL.ordinal(),
		Names.moveNames.WRING_OUT.ordinal(),
		Names.moveNames.X_SCISSOR.ordinal()
		};
	
	double baseHp = 60;
	double baseAttack = 115;
	double baseDefense = 105;
	double baseSpAttack = 65;
	double baseSpDefense = 70;
	double baseSpeed = 80;

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
	double weight = 40.5; //in kg
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
