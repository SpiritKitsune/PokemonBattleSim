package core;
public class Pokemon 
{
	public static final int GENDERLESS = 0;
	public static final int MALE = 1;
	public static final int FEMALE = 2;

	String name;
	String sprite;
	int type1;
	int type2;
	static int[] validMoves;
	
	double level;
	int attack;
	int defense;
	int spAttack;
	int spDefense;
	int speed;
	int hp;
	double accuracy;
	
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
	
	double baseAttack;
	double baseDefense;
	double baseSpAttack;
	double baseSpDefense;
	double baseSpeed;
	double baseHp;
	
	int nature = 0;
	
	int statusNonVolatile;
	boolean[] statusVolatile = new boolean[17];
	boolean[] statusVolatileBattle = new boolean[19];
	double currentHP;
	double critLevel = DamageCalc.CRIT_0;
	int stageHP = 0;
	int stageAttack = 0;
	int stageDefense = 0;
	int stageSpAttack = 0;
	int stageSpDefense = 0;
	int stageSpeed = 0;
	int stageAccuracy = 0;
	int stageEvasion = 0;
	double weight; //in kg
	int gender;
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
	int storedDamage = 0;
	int moveRepeatCounter = 0;
	boolean enraged = false;
	
	Move forceMove;
	Move lastMove;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType1() {
		return type1;
	}
	public void setType1(int type1) {
		this.type1 = type1;
	}
	public int getType2() {
		return type2;
	}
	public void setType2(int type2) {
		this.type2 = type2;
	}
	public static int[] getValidMoves() {
		return validMoves;
	}
	public static void setValidMoves(int[] validMoves) {
		Pokemon.validMoves = validMoves;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getSpAttack() {
		return spAttack;
	}
	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}
	public int getSpDefense() {
		return spDefense;
	}
	public void setSpDefense(int spDefense) {
		this.spDefense = spDefense;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public double getCritLevel() {
		return critLevel;
	}
	public void setCritLevel(double critLevel) {
		this.critLevel = critLevel;
	}
	public double getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(double currentHP) {
		this.currentHP = currentHP;
	}
	public int getStageHP() {
		return stageHP;
	}
	public void setStageHP(int stageHP) {
		this.stageHP = stageHP;
	}
	public int getStageAttack() {
		return stageAttack;
	}
	public void setStageAttack(int stageAttack) {
		this.stageAttack = stageAttack;
	}
	public int getStageDefense() {
		return stageDefense;
	}
	public void setStageDefense(int stageDefense) {
		this.stageDefense = stageDefense;
	}
	public int getStageSpAttack() {
		return stageSpAttack;
	}
	public void setStageSpAttack(int stageSpAttack) {
		this.stageSpAttack = stageSpAttack;
	}
	public int getStageSpDefense() {
		return stageSpDefense;
	}
	public void setStageSpDefense(int stageSpDefense) {
		this.stageSpDefense = stageSpDefense;
	}
	public int getStageSpeed() {
		return stageSpeed;
	}
	public void setStageSpeed(int stageSpeed) {
		this.stageSpeed = stageSpeed;
	}
	public double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}
	public int getStageAccuracy() {
		return stageAccuracy;
	}
	public void setStageAccuracy(int stageAccuracy) {
		this.stageAccuracy = stageAccuracy;
	}
	public int getStageEvasion() {
		return stageEvasion;
	}
	public void setStageEvasion(int stageEvasion) {
		this.stageEvasion = stageEvasion;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getStatusNonVolatile() {
		return statusNonVolatile;
	}
	public void setStatusNonVolatile(int statusNonVolatile) {
		this.statusNonVolatile = statusNonVolatile;
	}
	public boolean[] getStatusVolatile() {
		return statusVolatile;
	}
	public void setStatusVolatile(boolean[] statusVolatile) {
		this.statusVolatile = statusVolatile;
	}
	public boolean[] getStatusVolatileBattle() {
		return statusVolatileBattle;
	}
	public void setStatusVolatileBattle(boolean[] statusVolatileBattle) {
		this.statusVolatileBattle = statusVolatileBattle;
	}
	
	public void updateStatusVolatile(int status, boolean state)
	{
		getStatusVolatile()[status] = state;
	}
	public void updateStatusVolatileBattle(int status, boolean state)
	{
		getStatusVolatileBattle()[status] = state;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Move[] getMoveSet() {
		return moveSet;
	}
	public void setMoveSet(Move[] moveSet) {
		this.moveSet = moveSet;
	}
	
	public Move getMoveFromPokemon(int movePosition)
	{
		return getMoveSet()[movePosition];
	}
	public int getBpCounter() {
		return bpCounter;
	}
	public void setBpCounter(int bpCounter) {
		this.bpCounter = bpCounter;
	}
	public int getSleepCounter() {
		return sleepCounter;
	}
	public void setSleepCounter(int sleepCounter) {
		this.sleepCounter = sleepCounter;
	}
	public int getBoundCounter() {
		return boundCounter;
	}
	public void setBoundCounter(int boundCounter) {
		this.boundCounter = boundCounter;
	}
	public int getConfusionCounter() {
		return confusionCounter;
	}
	public void setConfusionCounter(int confusionCounter) {
		this.confusionCounter = confusionCounter;
	}
	public int getEmbargoCounter() {
		return embargoCounter;
	}
	public void setEmbargoCounter(int embargoCounter) {
		this.embargoCounter = embargoCounter;
	}
	public int getHealBlockCounter() {
		return healBlockCounter;
	}
	public void setHealBlockCounter(int healBlockCounter) {
		this.healBlockCounter = healBlockCounter;
	}
	public int getPerishSongCounter() {
		return perishSongCounter;
	}
	public void setPerishSongCounter(int perishSongCounter) {
		this.perishSongCounter = perishSongCounter;
	}
	public int getTauntCounter() {
		return tauntCounter;
	}
	public void setTauntCounter(int tauntCounter) {
		this.tauntCounter = tauntCounter;
	}
	public Move getLastMove() {
		return lastMove;
	}
	public void setLastMove(Move lastMove) {
		this.lastMove = lastMove;
	}
	public int getLastDamageTaken() {
		return lastDamageTaken;
	}
	public void setLastDamageTaken(int lastDamageTaken) {
		this.lastDamageTaken = lastDamageTaken;
	}
	public int getBideCounter() {
		return bideCounter;
	}
	public void setBideCounter(int bideCounter) {
		this.bideCounter = bideCounter;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	public Move getForceMove() {
		return forceMove;
	}
	public void setForceMove(Move forceMove) {
		this.forceMove = forceMove;
	}
	public int getStoredDamage() {
		return storedDamage;
	}
	public void setStoredDamage(int storedDamage) {
		this.storedDamage = storedDamage;
	}
	public int getMoveRepeatCounter() {
		return moveRepeatCounter;
	}
	public void setMoveRepeatCounter(int moveRepeatCounter) {
		this.moveRepeatCounter = moveRepeatCounter;
	}
	public boolean isEnraged() {
		return enraged;
	}
	public void setEnraged(boolean enraged) {
		this.enraged = enraged;
	}
	public double getIvAttack() {
		return ivAttack;
	}
	public void setIvAttack(double ivAttack) {
		this.ivAttack = ivAttack;
	}
	public double getIvDefense() {
		return ivDefense;
	}
	public void setIvDefense(double ivDefense) {
		this.ivDefense = ivDefense;
	}
	public double getIvSpAttack() {
		return ivSpAttack;
	}
	public void setIvSpAttack(double ivSpAttack) {
		this.ivSpAttack = ivSpAttack;
	}
	public double getIvSpDefense() {
		return ivSpDefense;
	}
	public void setIvSpDefense(double ivSpDefense) {
		this.ivSpDefense = ivSpDefense;
	}
	public double getIvSpeed() {
		return ivSpeed;
	}
	public void setIvSpeed(double ivSpeed) {
		this.ivSpeed = ivSpeed;
	}
	public double getIvHp() {
		return ivHp;
	}
	public void setIvHp(double ivHp) {
		this.ivHp = ivHp;
	}
	public double getEvAttack() {
		return evAttack;
	}
	public void setEvAttack(double evAttack) {
		this.evAttack = evAttack;
	}
	public double getEvDefense() {
		return evDefense;
	}
	public void setEvDefense(double evDefense) {
		this.evDefense = evDefense;
	}
	public double getEvSpAttack() {
		return evSpAttack;
	}
	public void setEvSpAttack(double evSpAttack) {
		this.evSpAttack = evSpAttack;
	}
	public double getEvSpDefense() {
		return evSpDefense;
	}
	public void setEvSpDefense(double evSpDefense) {
		this.evSpDefense = evSpDefense;
	}
	public double getEvSpeed() {
		return evSpeed;
	}
	public void setEvSpeed(double evSpeed) {
		this.evSpeed = evSpeed;
	}
	public double getEvHp() {
		return evHp;
	}
	public void setEvHp(double evHp) {
		this.evHp = evHp;
	}
	public double getBaseAttack() {
		return baseAttack;
	}
	public void setBaseAttack(double baseAttack) {
		this.baseAttack = baseAttack;
	}
	public double getBaseDefense() {
		return baseDefense;
	}
	public void setBaseDefense(double baseDefense) {
		this.baseDefense = baseDefense;
	}
	public double getBaseSpAttack() {
		return baseSpAttack;
	}
	public void setBaseSpAttack(double baseSpAttack) {
		this.baseSpAttack = baseSpAttack;
	}
	public double getBaseSpDefense() {
		return baseSpDefense;
	}
	public void setBaseSpDefense(double baseSpDefense) {
		this.baseSpDefense = baseSpDefense;
	}
	public double getBaseSpeed() {
		return baseSpeed;
	}
	public void setBaseSpeed(double baseSpeed) {
		this.baseSpeed = baseSpeed;
	}
	public double getBaseHp() {
		return baseHp;
	}
	public void setBaseHp(double baseHp) {
		this.baseHp = baseHp;
	}
	public int getNature() {
		return nature;
	}
	public void setNature(int nature) {
		this.nature = nature;
	}
}
