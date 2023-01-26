package pokemondata;

import core.*;

public class Nidoking extends Pokemon
{
	public Nidoking() 
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
	static String name = "Nidoking";
	String sprite = "nidoking1.png";
	static int type1 = TypeTable.POISON;
	static int type2 = TypeTable.GROUND;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.AMNESIA.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BEAT_UP.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.BULLDOZE.ordinal(),
		Names.moveNames.CAPTIVATE.ordinal(),
		Names.moveNames.CHIP_AWAY.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CONFUSION.ordinal(),
		Names.moveNames.COUNTER.ordinal(),
		Names.moveNames.DISABLE.ordinal(),
		Names.moveNames.DOUBLE_KICK.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DRAGON_TAIL.ordinal(),
		Names.moveNames.EARTH_POWER.ordinal(),
		Names.moveNames.EARTHQUAKE.ordinal(),
		Names.moveNames.ECHOED_VOICE.ordinal(),
		Names.moveNames.ENDURE.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FIRE_BLAST.ordinal(),
		Names.moveNames.FLAMETHROWER.ordinal(),
		Names.moveNames.FLATTER.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FOCUS_BLAST.ordinal(),
		Names.moveNames.FOCUS_ENERGY.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.FURY_ATTACK.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.HEAD_SMASH.ordinal(),
		Names.moveNames.HELPING_HAND.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HORN_ATTACK.ordinal(),
		Names.moveNames.HORN_DRILL.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.IRON_TAIL.ordinal(),
		Names.moveNames.LEER.ordinal(),
		Names.moveNames.MEGAHORN.ordinal(),
		Names.moveNames.PECK.ordinal(),
		Names.moveNames.POISON_JAB.ordinal(),
		Names.moveNames.POISON_STING.ordinal(),
		Names.moveNames.POISON_TAIL.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.QUASH.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROAR.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SHADOW_CLAW.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SLUDGE_BOMB.ordinal(),
		Names.moveNames.SLUDGE_WAVE.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.SMART_STRIKE.ordinal(),
		Names.moveNames.STONE_EDGE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUCKER_PUNCH.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SUPERSONIC.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.TAKE_DOWN.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THRASH.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TOXIC_SPIKES.ordinal(),
		Names.moveNames.VENOM_DRENCH.ordinal(),
		Names.moveNames.VENOSHOCK.ordinal()
		};
	
	double baseHp = 81;
	double baseAttack = 92;
	double baseDefense = 77;
	double baseSpAttack = 85;
	double baseSpDefense = 75;
	double baseSpeed = 85;

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
	double weight = 62; //in kg
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
