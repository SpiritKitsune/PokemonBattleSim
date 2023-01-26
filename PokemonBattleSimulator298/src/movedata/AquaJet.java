package movedata;
import core.*;

public class AquaJet extends Move
{

	public AquaJet()
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
	
	int id = Names.moveNames.AQUA_JET.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.WATER;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 40;
	int accuracy = 100;
	int priority = 1;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
}
