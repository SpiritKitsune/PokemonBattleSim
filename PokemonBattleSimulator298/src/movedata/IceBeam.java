package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class IceBeam extends Move
{
	public IceBeam() 
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
	int id = Names.moveNames.ICE_BEAM.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ICE;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 90;
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
			if(Status.canStatusNonVolatile(target, Status.FREEZE))
			{
				target.setStatusNonVolatile(Status.FREEZE);
			}
		}
	}
}
