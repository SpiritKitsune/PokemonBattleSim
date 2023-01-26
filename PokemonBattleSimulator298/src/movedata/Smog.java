package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class Smog extends Move
{
	public Smog()
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


	int id = Names.moveNames.SMOG.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.POISON;
	int category = Move.SPECIAL;
	int pp = 20;
	int maxPP = 32;
	int power = 30;
	int accuracy = 70;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;


	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(ThreadLocalRandom.current().nextInt(9) <= 3)
		{
			if(Status.canStatusNonVolatile(target, Status.POISON))
			{
				target.setStatusNonVolatile(Status.POISON);
			}
		}
	}
}
