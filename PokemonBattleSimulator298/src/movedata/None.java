package movedata;
import core.*;


/*
 * This move is never to be executed
 * Exists as a means of adding empty slots in movesets
 */
public class None extends Move
{

	public None()
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
	int id = Names.moveNames.NONE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NONE;
	int category = Move.STATUS;
	int pp = 0;
	int maxPP = 0;
	int power = 0;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = false;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;



}
