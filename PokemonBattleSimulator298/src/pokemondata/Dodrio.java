package pokemondata;

import core.*;

public class Dodrio extends Pokemon
{
	public Dodrio() 
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
	static String name = "Dodrio";
	String sprite = "dodrio1.png";
	static int type1 = TypeTable.NORMAL;
	static int type2 = TypeTable.FLYING;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ACUPRESSURE.ordinal(),
		Names.moveNames.AERIAL_ACE.ordinal(),
		Names.moveNames.AGILITY.ordinal(),
		Names.moveNames.ASSURANCE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BRAVE_BIRD.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.DOUBLE_HIT.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DRILL_PECK.ordinal(),
		Names.moveNames.ECHOED_VOICE.ordinal(),
		Names.moveNames.ENDEAVOR.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FEINT_ATTACK.ordinal(),
		Names.moveNames.FLAIL.ordinal(),
		Names.moveNames.FLY.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.FURY_ATTACK.ordinal(),
		Names.moveNames.GIGA_IMPACT.ordinal(),
		Names.moveNames.GROWL.ordinal(),
		Names.moveNames.HAZE.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.HYPER_BEAM.ordinal(),
		Names.moveNames.JUMP_KICK.ordinal(),
		Names.moveNames.MIRROR_MOVE.ordinal(),
		Names.moveNames.NATURAL_GIFT.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.PECK.ordinal(),
		Names.moveNames.PLUCK.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PURSUIT.ordinal(),
		Names.moveNames.QUICK_ATTACK.ordinal(),
		Names.moveNames.RAGE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROOST.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.STEEL_WING.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SUPERSONIC.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.SWORDS_DANCE.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.THIEF.ordinal(),
		Names.moveNames.THRASH.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal(),
		Names.moveNames.TRI_ATTACK.ordinal(),
		Names.moveNames.UPROAR.ordinal(),
		Names.moveNames.WORK_UP.ordinal()
		};
	
	double baseHp = 60;
	double baseAttack = 110;
	double baseDefense = 70;
	double baseSpAttack = 60;
	double baseSpDefense = 60;
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
	double weight = 85.2; //in kg
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
