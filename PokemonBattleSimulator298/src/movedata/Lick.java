package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class Lick extends Move
{
	public Lick() 
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
	int id = Names.moveNames.LICK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GHOST;
	int category = Move.PHYSICAL;
	int pp = 30;
	int maxPP = 48;
	public int power = 30;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(ThreadLocalRandom.current().nextInt(9) <= 2)
		{
			if(Status.canStatusNonVolatile(target, Status.PARALYSIS))
			{
				target.setStatusNonVolatile(Status.PARALYSIS);
			}
		}
	}
}
