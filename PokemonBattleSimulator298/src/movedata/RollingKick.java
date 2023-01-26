package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class RollingKick extends Move
{
	public RollingKick() 
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
	int id = Names.moveNames.ROLLING_KICK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FIGHTING;
	int category = Move.PHYSICAL;
	int pp = 15;
	int maxPP = 24;
	int power = 60;
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
		if(ThreadLocalRandom.current().nextInt(9) <= 2)
		{
			if(Status.canStatusVolatile(user, target, Status.FLINCH))
			{
				target.updateStatusVolatile(Status.FLINCH, true);
			}
		}
	}
}
