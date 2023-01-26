package movedata;
import core.*;

public class Clamp extends Move
{
	public Clamp() 
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
	int id = Names.moveNames.CLAMP.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.WATER;
	int category = Move.PHYSICAL;
	int pp = 15;
	int maxPP = 24;
	int power = 35;
	int accuracy = 85;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(Status.canStatusVolatile(user, target, Status.BOUND))
		{
			target.updateStatusVolatile(Status.BOUND, true);
		}
	}
}
