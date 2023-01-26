package movedata;
import core.*;

public class Roar extends Move
{
	public Roar() 
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
	int id = Names.moveNames.ROAR.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.STATUS;
	int pp = 20;
	int maxPP = 32;
	int power = 0;
	int accuracy = 0;
	int priority = -6;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
}
