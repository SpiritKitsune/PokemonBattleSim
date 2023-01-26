package pokemondata;

import core.*;

public class MrMime extends Pokemon
{
	public MrMime() 
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
	static String name = "Mr. Mime";
	String sprite = "mrmime1.png";
	static int type1 = TypeTable.PSYCHIC;
	static int type2 = TypeTable.FAIRY;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.AERIAL_ACE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BARRIER.ordinal(),
		Names.moveNames.BATON_PASS.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.CALM_MIND.ordinal(),
		Names.moveNames.CHARGE_BEAM.ordinal(),
		Names.moveNames.CHARM.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CONFUSE_RAY.ordinal(),
		Names.moveNames.CONFUSION.ordinal(),
		Names.moveNames.COPYCAT.ordinal(),
		Names.moveNames.DAZZLING_GLEAM.ordinal(),
		Names.moveNames.DOUBLE_SLAP.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DREAM_EATER.ordinal(),
		Names.moveNames.ENCORE.ordinal(),
		Names.moveNames.ENERGY_BALL.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FAKE_OUT.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FOCUS_BLAST.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.FUTURE_SIGHT.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.GRASS_KNOT.ordinal(),
		Names.moveNames.GUARD_SWAP.ordinal(),
		Names.moveNames.HEALING_WISH.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.HYPNOSIS.ordinal(),
		Names.moveNames.ICY_WIND.ordinal(),
		Names.moveNames.INFESTATION.ordinal(),
		Names.moveNames.LIGHT_SCREEN.ordinal(),
		Names.moveNames.MAGIC_ROOM.ordinal(),
		Names.moveNames.MAGICAL_LEAF.ordinal(),
		Names.moveNames.MEDITATE.ordinal(),
		Names.moveNames.MIMIC.ordinal(),
		Names.moveNames.MISTY_TERRAIN.ordinal(),
		Names.moveNames.NASTY_PLOT.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.POWER_SPLIT.ordinal(),
		Names.moveNames.POWER_SWAP.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYBEAM.ordinal(),
		Names.moveNames.PSYCH_UP.ordinal(),
		Names.moveNames.PSYCHIC.ordinal(),
		Names.moveNames.PSYSHOCK.ordinal(),
		Names.moveNames.PSYWAVE.ordinal(),
		Names.moveNames.QUICK_GUARD.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.RECYCLE.ordinal(),
		Names.moveNames.REFLECT.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROLE_PLAY.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SAFEGUARD.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SOLAR_BEAM.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.TEETER_DANCE.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDER_WAVE.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TICKLE.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TRICK.ordinal(),
		Names.moveNames.TRICK_ROOM.ordinal(),
		Names.moveNames.WAKE_UP_SLAP.ordinal(),
		Names.moveNames.WIDE_GUARD.ordinal()
		};
	
	double baseHp = 40;
	double baseAttack = 45;
	double baseDefense = 65;
	double baseSpAttack = 100;
	double baseSpDefense = 120;
	double baseSpeed = 90;

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
	double weight = 54.5; //in kg
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
