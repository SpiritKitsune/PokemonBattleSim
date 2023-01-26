package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class Confusion extends Move
{
	public Confusion() 
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
	int id = Names.moveNames.CONFUSION.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.PSYCHIC;
	int category = Move.SPECIAL;
	int pp = 25;
	int maxPP = 40;
	int power = 50;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(ThreadLocalRandom.current().nextInt(9) == 0)
		{
			if(Status.canStatusVolatile(user, target, Status.CONFUSED))
			{
				target.updateStatusVolatile(Status.CONFUSED, true);
			}
		}
	}
}
