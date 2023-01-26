package pokemondata;

import core.*;

public class Onix extends Pokemon
{
	public Onix() 
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
	static String name = "Onix";
	String sprite = "onix1.png";
	static int type1 = TypeTable.ROCK;
	static int type2 = TypeTable.GROUND;
	static int[] validMoves = 
		{
		Names.moveNames.NONE.ordinal(),
		Names.moveNames.ATTRACT.ordinal(),
		Names.moveNames.BIND.ordinal(),
		Names.moveNames.BLOCK.ordinal(),
		Names.moveNames.BRUTAL_SWING.ordinal(),
		Names.moveNames.BULLDOZE.ordinal(),
		Names.moveNames.CONFIDE.ordinal(),
		Names.moveNames.CURSE.ordinal(),
		Names.moveNames.DEFENSE_CURL.ordinal(),
		Names.moveNames.DIG.ordinal(),
		Names.moveNames.DOUBLE_TEAM.ordinal(),
		Names.moveNames.DOUBLE_EDGE.ordinal(),
		Names.moveNames.DRAGON_BREATH.ordinal(),
		Names.moveNames.DRAGON_TAIL.ordinal(),
		Names.moveNames.EARTHQUAKE.ordinal(),
		Names.moveNames.EXPLOSION.ordinal(),
		Names.moveNames.FACADE.ordinal(),
		Names.moveNames.FLAIL.ordinal(),
		Names.moveNames.FLASH_CANNON.ordinal(),
		Names.moveNames.FRUSTRATION.ordinal(),
		Names.moveNames.GYRO_BALL.ordinal(),
		Names.moveNames.HARDEN.ordinal(),
		Names.moveNames.HEAVY_SLAM.ordinal(),
		Names.moveNames.HIDDEN_POWER.ordinal(),
		Names.moveNames.IRON_TAIL.ordinal(),
		Names.moveNames.MUD_SPORT.ordinal(),
		Names.moveNames.NATURE_POWER.ordinal(),
		Names.moveNames.PAYBACK.ordinal(),
		Names.moveNames.PROTECT.ordinal(),
		Names.moveNames.PSYCH_UP.ordinal(),
		Names.moveNames.RAGE.ordinal(),
		Names.moveNames.REST.ordinal(),
		Names.moveNames.RETURN.ordinal(),
		Names.moveNames.ROAR.ordinal(),
		Names.moveNames.ROCK_BLAST.ordinal(),
		Names.moveNames.ROCK_CLIMB.ordinal(),
		Names.moveNames.ROCK_POLISH.ordinal(),
		Names.moveNames.ROCK_SLIDE.ordinal(),
		Names.moveNames.ROCK_THROW.ordinal(),
		Names.moveNames.ROCK_TOMB.ordinal(),
		Names.moveNames.ROLLOUT.ordinal(),
		Names.moveNames.ROTOTILLER.ordinal(),
		Names.moveNames.ROUND.ordinal(),
		Names.moveNames.SAND_TOMB.ordinal(),
		Names.moveNames.SANDSTORM.ordinal(),
		Names.moveNames.SCREECH.ordinal(),
		Names.moveNames.SLAM.ordinal(),
		Names.moveNames.SLEEP_TALK.ordinal(),
		Names.moveNames.SMACK_DOWN.ordinal(),
		Names.moveNames.STEALTH_ROCK.ordinal(),
		Names.moveNames.STONE_EDGE.ordinal(),
		Names.moveNames.SUBSTITUTE.ordinal(),
		Names.moveNames.SUNNY_DAY.ordinal(),
		Names.moveNames.SWAGGER.ordinal(),
		Names.moveNames.TACKLE.ordinal(),
		Names.moveNames.TAUNT.ordinal(),
		Names.moveNames.TORMENT.ordinal(),
		Names.moveNames.TOXIC.ordinal()
		};
	
	double baseHp = 35;
	double baseAttack = 45;
	double baseDefense = 160;
	double baseSpAttack = 30;
	double baseSpDefense = 45;
	double baseSpeed = 70;

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
	double weight = 210; //in kg
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
