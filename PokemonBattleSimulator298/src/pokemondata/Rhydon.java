package pokemondata;

import core.*;

public class Rhydon extends Pokemon
{
	public Rhydon() 
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
	static String name = "Rhydon";
	String sprite = "rhydon1.png";
	static int type1 = TypeTable.GROUND;
	static int type2 = TypeTable.ROCK;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.BRUTAL_SWING.ordinal(),
		Names.moveNames.BULLDOZE.ordinal(),
		Names.moveNames.CHIP_AWAY.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.COUNTER.ordinal(),
		Names.moveNames.CRUNCH.ordinal(),
		Names.moveNames.CRUSH_CLAW.ordinal(),
		Names.moveNames.CURSE.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DRAGON_RUSH.ordinal(),
		Names.moveNames.DRAGON_TAIL.ordinal(),
		Names.moveNames.DRILL_RUN.ordinal(),
		Names.moveNames.EARTHQUAKE.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FIRE_BLAST.ordinal(),
		Names.moveNames.FIRE_FANG.ordinal(),
		Names.moveNames.FLAMETHROWER.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FOCUS_BLAST.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.FURY_ATTACK.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.GUARD_SPLIT.ordinal(),
		Names.moveNames.HAMMER_ARM.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HORN_ATTACK.ordinal(),
		Names.moveNames.HORN_DRILL.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.ICE_FANG.ordinal(),
		Names.moveNames.IRON_TAIL.ordinal(),
		Names.moveNames.MAGNITUDE.ordinal(),
		Names.moveNames.MEGAHORN.ordinal(),
		Names.moveNames.METAL_BURST.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.POISON_JAB.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.REVERSAL.ordinal(),
		Names.moveNames.ROAR.ordinal(),
		Names.moveNames.ROCK_BLAST.ordinal(),
		Names.moveNames.ROCK_CLIMB.ordinal(),
		Names.moveNames.ROCK_POLISH.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROTOTILLER.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SCARY_FACE.ordinal(),
		Names.moveNames.SHADOW_CLAW.ordinal(),
		Names.moveNames.SKULL_BASH.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.SMART_STRIKE.ordinal(),
		Names.moveNames.STOMP.ordinal(),
		Names.moveNames.STONE_EDGE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.TAIL_WHIP.ordinal(),
		Names.moveNames.TAKE_DOWN.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDER_FANG.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TOXIC.ordinal()
		};
	
	double baseHp = 105;
	double baseAttack = 130;
	double baseDefense = 120;
	double baseSpAttack = 45;
	double baseSpDefense = 45;
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
	double weight = 120; //in kg
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
