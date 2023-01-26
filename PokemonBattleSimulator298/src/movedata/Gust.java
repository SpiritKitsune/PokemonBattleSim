package movedata;
import core.*;

public class Gust extends Move
{
	public Gust() 
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
	int id = Names.moveNames.GUST.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FLYING;
	int category = Move.SPECIAL;
	int pp = 35;
	int maxPP = 56;
	int power = 40;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	//Add double damage for fly, bounce, and sky drop
}
