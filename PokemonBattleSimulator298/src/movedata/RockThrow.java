package movedata;
import core.*;

public class RockThrow extends Move
{
	public RockThrow() 
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
	int id = Names.moveNames.ROCK_THROW.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ROCK;
	int category = Move.PHYSICAL;
	int pp = 15;
	int maxPP = 24;
	public int power = 50;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
}
