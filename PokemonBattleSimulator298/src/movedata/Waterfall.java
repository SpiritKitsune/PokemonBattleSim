package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class Waterfall extends Move
{
	public Waterfall() 
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
	int id = Names.moveNames.WATERFALL.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.WATER;
	int category = Move.PHYSICAL;
	int pp = 15;
	int maxPP = 24;
	int power = 80;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(ThreadLocalRandom.current().nextInt(9) <= 1)
		{
			if(Status.canStatusVolatile(user, target, Status.FLINCH))
			{
				target.updateStatusVolatile(Status.FLINCH, true);
			}
		}
	}
}
