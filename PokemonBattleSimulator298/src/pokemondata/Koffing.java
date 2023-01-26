package pokemondata;

import core.*;

public class Koffing extends Pokemon
{
	public Koffing() 
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
	static String name = "Koffing";
	String sprite = "koffing1.png";
	static int type1 = TypeTable.POISON;
	static int type2 = TypeTable.NONE;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ASSURANCE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BELCH.ordinal(),
		Names.moveNames.CLEAR_SMOG.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CURSE.ordinal(),
		Names.moveNames.DARK_PULSE.ordinal(),
		Names.moveNames.DESTINY_BOND.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.EXPLOSION.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FIRE_BLAST.ordinal(),
		Names.moveNames.FLAMETHROWER.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GRUDGE.ordinal(),
		Names.moveNames.GYRO_BALL.ordinal(),
		Names.moveNames.HAZE.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.INFESTATION.ordinal(),
		Names.moveNames.MEMENTO.ordinal(),
		Names.moveNames.PAIN_SPLIT.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.POISON_GAS.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYBEAM.ordinal(),
		Names.moveNames.PSYWAVE.ordinal(),
		Names.moveNames.RAIN_DANCE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SCREECH.ordinal(),
		Names.moveNames.SELF_DESTRUCT.ordinal(),
		Names.moveNames.SHADOW_BALL.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SLUDGE.ordinal(),
		Names.moveNames.SLUDGE_BOMB.ordinal(),
		Names.moveNames.SMOG.ordinal(),
		Names.moveNames.SMOKESCREEN.ordinal(),
		Names.moveNames.SPIT_UP.ordinal(),
		Names.moveNames.SPITE.ordinal(),
		Names.moveNames.STOCKPILE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWALLOW.ordinal(),
		Names.moveNames.TACKLE.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THUNDER.ordinal(),
		Names.moveNames.THUNDERBOLT.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TOXIC_SPIKES.ordinal(),
		Names.moveNames.VENOSHOCK.ordinal(),
		Names.moveNames.WILL_O_WISP.ordinal()
		};
	
	double baseHp = 40;
	double baseAttack = 65;
	double baseDefense = 95;
	double baseSpAttack = 60;
	double baseSpDefense = 45;
	double baseSpeed = 35;

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
	double weight = 1; //in kg
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
