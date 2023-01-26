package movedata;
import javax.swing.text.BadLocationException;

import core.*;

public class StunSpore extends Move
{
	public StunSpore() 
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
	int id = Names.moveNames.STUN_SPORE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GRASS;
	int category = Move.STATUS;
	int pp = 30;
	int maxPP = 48;
	int power = 0;
	int accuracy = 75;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(Status.canStatusNonVolatile(target, Status.PARALYSIS))
		{
			target.setStatusNonVolatile(Status.PARALYSIS);
		}
	}
}
