package movedata;
import javax.swing.text.BadLocationException;

import core.*;

public class Toxic extends Move
{
	public Toxic() 
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
	int id = Names.moveNames.TOXIC.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.POISON;
	int category = Move.STATUS;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		if(user.getType1() == TypeTable.POISON || user.getType2() == TypeTable.POISON)
		{
			setAccuracy(0);
		}
		else
		{
			setAccuracy(90);
		}
	}
	
	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(Status.canStatusNonVolatile(target, Status.BADLY_POISONED))
		{
			target.setStatusNonVolatile(Status.BADLY_POISONED);
		}
	}
}
