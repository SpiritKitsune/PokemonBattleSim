package movedata;
import core.*;

public class DrillPeck extends Move
{
	public DrillPeck() 
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
	int id = Names.moveNames.DRILL_PECK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FLYING;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 80;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
}
