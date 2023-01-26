package movedata;
import core.*;

public class WaterGun extends Move
{
	public WaterGun() 
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
	int id = Names.moveNames.WATER_GUN.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.WATER;
	int category = Move.SPECIAL;
	int pp = 25;
	int maxPP = 40;
	int power = 40;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
}
