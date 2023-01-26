package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class DizzyPunch extends Move
{
	public DizzyPunch() 
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
	int id = Names.moveNames.DIZZY_PUNCH.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 70;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(ThreadLocalRandom.current().nextInt(9) <= 1)
		{
			if(Status.canStatusVolatile(user, target, Status.CONFUSED))
			{
				target.updateStatusVolatile(Status.CONFUSED, true);
			}
		}
	}
}
