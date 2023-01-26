package core;

import javax.swing.text.BadLocationException;

public class Move 
{

	public static final int PHYSICAL = 1;
	public static final int SPECIAL = 2;
	public static final int STATUS = 3;
	int id;
	String name;
	int moveType;
	int category;
	int pp;
	int maxPP;
	int currentPP;
	int power; //TODO make power and accuracy doubles
	int accuracy;
	int priority;
	
	boolean contact = false;
	boolean protect = false;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	boolean canCOA = false;
	boolean isDisabled = false;
	
	int disableCounter = 0;

	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getMaxPP() {
		return maxPP;
	}

	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getMoveType() {
		return moveType;
	}

	public void setMoveType(int moveType) {
		this.moveType = moveType;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}
	public boolean isProtect() {
		return protect;
	}
	public void setProtect(boolean protect) {
		this.protect = protect;
	}
	public boolean isMagicCoat() {
		return magicCoat;
	}
	public void setMagicCoat(boolean magicCoat) {
		this.magicCoat = magicCoat;
	}
	public boolean isSnatch() {
		return snatch;
	}
	public void setSnatch(boolean snatch) {
		this.snatch = snatch;
	}
	public boolean isMirrorMove() {
		return mirrorMove;
	}
	public void setMirrorMove(boolean mirrorMove) {
		this.mirrorMove = mirrorMove;
	}
	public boolean isKingsRock() {
		return kingsRock;
	}
	public void setKingsRock(boolean kingsRock) {
		this.kingsRock = kingsRock;
	}
	public int getCurrentPP() {
		return currentPP;
	}
	public void setCurrentPP(int currentPP) {
		this.currentPP = currentPP;
	}
	public void effectPre(Pokemon user, Pokemon target)
	{
		return;
	}
	public boolean isCanCOA() {
		return canCOA;
	}
	public void setCanCOA(boolean canCOA) {
		this.canCOA = canCOA;
	}
	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		return;
	}
	public boolean isDisabled() {
		return isDisabled;
	}
	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	public int getDisableCounter() {
		return disableCounter;
	}
	public void setDisableCounter(int disableCounter) {
		this.disableCounter = disableCounter;
	}
	
	public void subtractPP()
	{
		this.currentPP = this.currentPP-1;
	}
	public void addPP(int x)
	{
		this.currentPP = this.currentPP+x;
	}
}
