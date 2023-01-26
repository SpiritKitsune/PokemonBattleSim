package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class BodySlam extends Move
{
	public BodySlam() 
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
	int id = Names.moveNames.BODY_SLAM.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 15;
	int maxPP = 24;
	int power = 85;
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
		if(ThreadLocalRandom.current().nextInt(9) <=2)
		{
			if(Status.canStatusNonVolatile(target, Status.PARALYSIS))
			{
				target.setStatusNonVolatile(Status.PARALYSIS);
			}
		}
	}
}
