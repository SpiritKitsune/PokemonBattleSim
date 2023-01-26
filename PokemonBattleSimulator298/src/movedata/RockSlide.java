package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class RockSlide extends Move
{
	public RockSlide()
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
	int id = Names.moveNames.ROCK_SLIDE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ROCK;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 75;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
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
