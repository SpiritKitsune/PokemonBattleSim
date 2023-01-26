package pokemondata;

import core.*;

public class Snorlax extends Pokemon
{
	public Snorlax() 
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
	static String name = "Snorlax";
	String sprite = "snorlax1.png";
	static int type1 = TypeTable.NORMAL;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.AFTER_YOU.ordinal(),
		Names.moveNames.AMNESIA.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BELCH.ordinal(),
		Names.moveNames.BELLY_DRUM.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BLOCK.ordinal(),
		Names.moveNames.BODY_SLAM.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.BULLDOZE.ordinal(),
		Names.moveNames.CHARM.ordinal(),
		Names.moveNames.CHIP_AWAY.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.COUNTER.ordinal(),
		Names.moveNames.CRUNCH.ordinal(),
		Names.moveNames.CURSE.ordinal(),
		Names.moveNames.DEFENSE_CURL.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DOUBLE_EDGE.ordinal(),
		Names.moveNames.EARTHQUAKE.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FIRE_BLAST.ordinal(),
		Names.moveNames.FISSURE.ordinal(),
		Names.moveNames.FLAMETHROWER.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FOCUS_BLAST.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.HAPPY_HOUR.ordinal(),
		Names.moveNames.HEAVY_SLAM.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HIGH_HORSEPOWER.ordinal(),
		Names.moveNames.HOLD_BACK.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.LAST_RESORT.ordinal(),
		Names.moveNames.LICK.ordinal(),
		Names.moveNames.METRONOME.ordinal(),
		Names.moveNames.NATURAL_GIFT.ordinal(),
		Names.moveNames.ODOR_SLEUTH.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYCHIC.ordinal(),
		Names.moveNames.PURSUIT.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.RECYCLE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROLLOUT.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SCREECH.ordinal(),
		Names.moveNames.SELF_DESTRUCT.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.SNATCH.ordinal(),
		Names.moveNames.SNORE.ordinal(),
		Names.moveNames.SOLAR_BEAM.ordinal(),
		Names.moveNames.STOCKPILE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWALLOW.ordinal(),
		Names.moveNames.TACKLE.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.WHIRLWIND.ordinal(),
		Names.moveNames.WILD_CHARGE.ordinal(),
		Names.moveNames.WORK_UP.ordinal(),
		Names.moveNames.YAWN.ordinal(),
		Names.moveNames.ZEN_HEADBUTT.ordinal()
		};
	
	double baseHp = 160;
	double baseAttack = 110;
	double baseDefense = 65;
	double baseSpAttack = 65;
	double baseSpDefense = 110;
	double baseSpeed = 30;

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
	double weight = 460; //in kg
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
