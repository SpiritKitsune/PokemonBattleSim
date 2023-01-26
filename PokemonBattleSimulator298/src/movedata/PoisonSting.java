package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class PoisonSting extends Move
{
	public PoisonSting()
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


	int id = Names.moveNames.POISON_STING.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.POISON;
	int category = Move.PHYSICAL;
	int pp = 35;
	int maxPP = 56;
	int power = 15;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;


	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(ThreadLocalRandom.current().nextInt(9) == 0)
		{
			if(Status.canStatusNonVolatile(target, Status.POISON))
			{
				target.setStatusNonVolatile(Status.POISON);
			}
		}
	}
}
