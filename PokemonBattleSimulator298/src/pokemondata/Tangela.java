package pokemondata;

import core.*;

public class Tangela extends Pokemon
{
	public Tangela() 
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
	static String name = "Tangela";
	String sprite = "tangela1.png";
	static int type1 = TypeTable.GRASS;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ABSORB.ordinal(),
		Names.moveNames.AMNESIA.ordinal(),
		Names.moveNames.ANCIENT_POWER.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BIND.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CONFUSION.ordinal(),
		Names.moveNames.CONSTRICT.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.ENDEAVOR.ordinal(),
		Names.moveNames.ENERGY_BALL.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FLAIL.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GIGA_DRAIN.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.GRASS_KNOT.ordinal(),
		Names.moveNames.GRASSY_TERRAIN.ordinal(),
		Names.moveNames.GROWTH.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.INFESTATION.ordinal(),
		Names.moveNames.INGRAIN.ordinal(),
		Names.moveNames.KNOCK_OFF.ordinal(),
		Names.moveNames.LEAF_STORM.ordinal(),
		Names.moveNames.LEECH_SEED.ordinal(),
		Names.moveNames.MEGA_DRAIN.ordinal(),
		Names.moveNames.NATURAL_GIFT.ordinal(),
		Names.moveNames.NATURE_POWER.ordinal(),
		Names.moveNames.POISON_POWDER.ordinal(),
		Names.moveNames.POWER_SWAP.ordinal(),
		Names.moveNames.POWER_WHIP.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYCH_UP.ordinal(),
		Names.moveNames.RAGE_POWDER.ordinal(),
		Names.moveNames.REFLECT.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SLAM.ordinal(),
		Names.moveNames.SLEEP_POWDER.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SLUDGE_BOMB.ordinal(),
		Names.moveNames.SOLAR_BEAM.ordinal(),
		Names.moveNames.STUN_SPORE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.TICKLE.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.VINE_WHIP.ordinal(),
		Names.moveNames.WRING_OUT.ordinal()
		};
	
	double baseHp = 65;
	double baseAttack = 55;
	double baseDefense = 115;
	double baseSpAttack = 100;
	double baseSpDefense = 40;
	double baseSpeed = 60;

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
	double weight = 35; //in kg
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
