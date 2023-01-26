package pokemondata;

import core.*;

public class Raticate extends Pokemon
{
	public Raticate() 
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
	static String name = "Raticate";
	String sprite = "raticate1.png";
	static int type1 = TypeTable.NORMAL;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ASSURANCE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BITE.ordinal(),
		Names.moveNames.BLIZZARD.ordinal(),
		Names.moveNames.CHARGE_BEAM.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.COUNTER.ordinal(),
		Names.moveNames.CRUNCH.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DOUBLE_EDGE.ordinal(),
		Names.moveNames.ENDEAVOR.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FINAL_GAMBIT.ordinal(),
		Names.moveNames.FLAME_WHEEL.ordinal(),
		Names.moveNames.FOCUS_ENERGY.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.FURY_SWIPES.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.GRASS_KNOT.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.HYPER_FANG.ordinal(),
		Names.moveNames.ICE_BEAM.ordinal(),
		Names.moveNames.LAST_RESORT.ordinal(),
		Names.moveNames.ME_FIRST.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PURSUIT.ordinal(),
		Names.moveNames.QUICK_ATTACK.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.REVENGE.ordinal(),
		Names.moveNames.REVERSAL.ordinal(),
		Names.moveNames.ROAR.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SCARY_FACE.ordinal(),
		Names.moveNames.SCREECH.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUCKER_PUNCH.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SUPER_FANG.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.TACKLE.ordinal(),
		Names.moveNames.TAIL_WHIP.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDER_WAVE.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.UPROAR.ordinal(),
		Names.moveNames.U_TURN.ordinal(),
		Names.moveNames.WILD_CHARGE.ordinal(),
		Names.moveNames.WORK_UP.ordinal()
		};
	
	double baseHp = 55;
	double baseAttack = 81;
	double baseDefense = 60;
	double baseSpAttack = 50;
	double baseSpDefense = 70;
	double baseSpeed = 97;

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
	double weight = 18.5; //in kg
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
