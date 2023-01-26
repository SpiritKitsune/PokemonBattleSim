package pokemondata;

import core.*;

public class Bellsprout extends Pokemon
{
	public Bellsprout() 
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
	static String name = "Bellsprout";
	String sprite = "bellsprout1.png";
	static int type1 = TypeTable.GRASS;
	static int type2 = TypeTable.POISON;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ACID.ordinal(),
		Names.moveNames.ACID_SPRAY.ordinal(),
		Names.moveNames.ACID_SPRAY.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BELCH.ordinal(),
		Names.moveNames.BULLET_SEED.ordinal(),
		Names.moveNames.CLEAR_SMOG.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.ENCORE.ordinal(),
		Names.moveNames.ENERGY_BALL.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GASTRO_ACID.ordinal(),
		Names.moveNames.GIGA_DRAIN.ordinal(),
		Names.moveNames.GRASS_KNOT.ordinal(),
		Names.moveNames.GROWTH.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.INFESTATION.ordinal(),
		Names.moveNames.INGRAIN.ordinal(),
		Names.moveNames.KNOCK_OFF.ordinal(),
		Names.moveNames.LEECH_LIFE.ordinal(),
		Names.moveNames.MAGICAL_LEAF.ordinal(),
		Names.moveNames.NATURAL_GIFT.ordinal(),
		Names.moveNames.NATURE_POWER.ordinal(),
		Names.moveNames.POISON_JAB.ordinal(),
		Names.moveNames.POISON_POWDER.ordinal(),
		Names.moveNames.POWER_WHIP.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.RAZOR_LEAF.ordinal(),
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
		Names.moveNames.SWEET_SCENT.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.SYNTHESIS.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.TICKLE.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.VENOSHOCK.ordinal(),
		Names.moveNames.VINE_WHIP.ordinal(),
		Names.moveNames.WEATHER_BALL.ordinal(),
		Names.moveNames.WORRY_SEED.ordinal(),
		Names.moveNames.WRAP.ordinal(),
		Names.moveNames.WRING_OUT.ordinal()
		};
	
	double baseHp = 50;
	double baseAttack = 75;
	double baseDefense = 35;
	double baseSpAttack = 70;
	double baseSpDefense = 30;
	double baseSpeed = 40;

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
	double weight = 4; //in kg
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