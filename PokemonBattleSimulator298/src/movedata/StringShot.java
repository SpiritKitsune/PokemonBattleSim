package movedata;
import core.*;

public class StringShot extends Move
{
	public StringShot() 
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
	int id = Names.moveNames.STRING_SHOT.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.BUG;
	int category = Move.STATUS;
	int pp = 40;
	int maxPP = 64;
	int power = 0;
	int accuracy = 95;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		target.setStageSpeed(target.getStageSpeed()-2);
	}
}
