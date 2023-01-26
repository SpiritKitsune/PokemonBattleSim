package movedata;
import core.*;

public class Haze extends Move
{
	public Haze() 
	{
		setId(id);
		setName(name);
		setMoveType(moveType);
		setCategory(category);
		setPp(pp);
		setMaxPP(maxPP);
		setPower(power);
		setAccuracy(accuracy);
		setPriority(priority);
		setContact(contact);
		setProtect(protect);
		setMagicCoat(magicCoat);
		setSnatch(snatch);
		setMirrorMove(mirrorMove);
		setKingsRock(kingsRock);
	}
	int id = Names.moveNames.HAZE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ICE;
	int category = Move.STATUS;
	int pp = 30;
	int maxPP = 48;
	int power = 0;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = false;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		user.setStageAccuracy(0);
		user.setStageAttack(0);
		user.setStageDefense(0);
		user.setStageEvasion(0);
		user.setStageHP(0);
		user.setStageSpAttack(0);
		user.setStageSpDefense(0);
		user.setStageSpeed(0);
		
		target.setStageAccuracy(0);
		target.setStageAttack(0);
		target.setStageDefense(0);
		target.setStageEvasion(0);
		target.setStageHP(0);
		target.setStageSpAttack(0);
		target.setStageSpDefense(0);
		target.setStageSpeed(0);
	}
}
