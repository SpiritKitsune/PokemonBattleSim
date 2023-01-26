package pokemondata;

import core.*;

public class Mew extends Pokemon
{
	public Mew() 
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
	static String name = "Mew";
	String sprite = "mew1.png";
	static int type1 = TypeTable.PSYCHIC;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ACROBATICS.ordinal(),
		Names.moveNames.AERIAL_ACE.ordinal(),
		Names.moveNames.AMNESIA.ordinal(),
		Names.moveNames.ANCIENT_POWER.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.AURA_SPHERE.ordinal(),
		Names.moveNames.AURORA_VEIL.ordinal(),
		Names.moveNames.BARRIER.ordinal(),
		Names.moveNames.BATON_PASS.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BRICK_BREAK.ordinal(),
		Names.moveNames.BRUTAL_SWING.ordinal(),
		Names.moveNames.BULK_UP.ordinal(),
		Names.moveNames.BULLDOZE.ordinal(),
		Names.moveNames.CALM_MIND.ordinal(),
		Names.moveNames.CHARGE_BEAM.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.DARK_PULSE.ordinal(),
		Names.moveNames.DAZZLING_GLEAM.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DRAGON_CLAW.ordinal(),
		Names.moveNames.DRAGON_TAIL.ordinal(),
		Names.moveNames.DREAM_EATER.ordinal(),
		Names.moveNames.EARTHQUAKE.ordinal(),
		Names.moveNames.ECHOED_VOICE.ordinal(),
		Names.moveNames.EMBARGO.ordinal(),
		Names.moveNames.ENERGY_BALL.ordinal(),
		Names.moveNames.EXPLOSION.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FALSE_SWIPE.ordinal(),
		Names.moveNames.FIRE_BLAST.ordinal(),
		Names.moveNames.FLAME_CHARGE.ordinal(),
		Names.moveNames.FLAMETHROWER.ordinal(),
		Names.moveNames.FLASH_CANNON.ordinal(),
		Names.moveNames.FLING.ordinal(),
		Names.moveNames.FLY.ordinal(),
		Names.moveNames.FOCUS_BLAST.ordinal(),
		Names.moveNames.FROST_BREATH.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.GRASS_KNOT.ordinal(),
		Names.moveNames.GYRO_BALL.ordinal(),
		Names.moveNames.HAIL.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.INFESTATION.ordinal(),
		Names.moveNames.LEECH_LIFE.ordinal(),
		Names.moveNames.LIGHT_SCREEN.ordinal(),
		Names.moveNames.LOW_SWEEP.ordinal(),
		Names.moveNames.ME_FIRST.ordinal(),
		Names.moveNames.MEGA_PUNCH.ordinal(),
		Names.moveNames.METRONOME.ordinal(),
		Names.moveNames.NASTY_PLOT.ordinal(),
		Names.moveNames.NATURE_POWER.ordinal(),
		Names.moveNames.OVERHEAT.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.POISON_JAB.ordinal(),
		Names.moveNames.POUND.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYCH_UP.ordinal(),
		Names.moveNames.PSYCHIC.ordinal(),
		Names.moveNames.PSYSHOCK.ordinal(),
		Names.moveNames.QUASH.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REFLECT.ordinal(),
		Names.moveNames.REFLECT_TYPE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROAR.ordinal(),
		Names.moveNames.ROCK_POLISH.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROOST.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SAFEGUARD.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SCALD.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SHADOW_CLAW.ordinal(),
		Names.moveNames.SKY_DROP.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SLUDGE_BOMB.ordinal(),
		Names.moveNames.SLUDGE_WAVE.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.SMART_STRIKE.ordinal(),
		Names.moveNames.SNARL.ordinal(),
		Names.moveNames.SOLAR_BEAM.ordinal(),
		Names.moveNames.STEEL_WING.ordinal(),
		Names.moveNames.STONE_EDGE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDER_WAVE.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TRANSFORM.ordinal(),
		Names.moveNames.TRICK_ROOM.ordinal(),
		Names.moveNames.U_TURN.ordinal(),
		Names.moveNames.VENOSHOCK.ordinal(),
		Names.moveNames.VOLT_SWITCH.ordinal(),
		Names.moveNames.WATERFALL.ordinal(),
		Names.moveNames.WILD_CHARGE.ordinal(),
		Names.moveNames.WILL_O_WISP.ordinal(),
		Names.moveNames.WORK_UP.ordinal(),
		Names.moveNames.X_SCISSOR.ordinal()
		};
	
	double baseHp = 100;
	double baseAttack = 100;
	double baseDefense = 100;
	double baseSpAttack = 100;
	double baseSpDefense = 100;
	double baseSpeed = 100;

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
