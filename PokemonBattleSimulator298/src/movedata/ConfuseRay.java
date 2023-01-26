package movedata;
import core.*;

public class ConfuseRay extends Move
{
	public ConfuseRay() 
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
	int id = Names.moveNames.CONFUSE_RAY.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GHOST;
	int category = Move.STATUS;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(Status.canStatusVolatile(user, target, Status.CONFUSED))
		{
			Status.setConfusionCounters(target);
			target.updateStatusVolatile(Status.CONFUSED, true);
		}
	}
}
