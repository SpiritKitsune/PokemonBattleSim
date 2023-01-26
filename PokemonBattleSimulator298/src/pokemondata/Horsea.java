package pokemondata;

import core.*;

public class Horsea extends Pokemon
{
	public Horsea() 
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
	static String name = "Horsea";
	String sprite = "horsea1.png";
	static int type1 = TypeTable.WATER;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.AGILITY.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.AURORA_BEAM.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.BRINE.ordinal(),
		Names.moveNames.BUBBLE.ordinal(),
		Names.moveNames.BUBBLE_BEAM.ordinal(),
		Names.moveNames.CLEAR_SMOG.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.DISABLE.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DRAGON_BREATH.ordinal(),
		Names.moveNames.DRAGON_DANCE.ordinal(),
		Names.moveNames.DRAGON_PULSE.ordinal(),
		Names.moveNames.DRAGON_RAGE.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FLAIL.ordinal(),
		Names.moveNames.FLASH_CANNON.ordinal(),
		Names.moveNames.FOCUS_ENERGY.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.HAIL.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYDRO_PUMP.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.LEER.ordinal(),
		Names.moveNames.MUDDY_WATER.ordinal(),
		Names.moveNames.OCTAZOOKA.ordinal(),
		Names.moveNames.OUTRAGE.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.RAZOR_WIND.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SCALD.ordinal(),
		Names.moveNames.SIGNAL_BEAM.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMOKESCREEN.ordinal(),
		Names.moveNames.SPLASH.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SURF.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TWISTER.ordinal(),
		Names.moveNames.WATER_GUN.ordinal(),
		Names.moveNames.WATER_PULSE.ordinal(),
		Names.moveNames.WATERFALL.ordinal()
		};
	
	double baseHp = 30;
	double baseAttack = 40;
	double baseDefense = 70;
	double baseSpAttack = 70;
	double baseSpDefense = 25;
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
	double weight = 8; //in kg
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
