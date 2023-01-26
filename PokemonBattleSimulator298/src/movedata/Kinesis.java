package movedata;
import core.*;

public class Kinesis extends Move
{
	public Kinesis() 
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
	int id = Names.moveNames.KINESIS.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.PSYCHIC;
	int category = Move.STATUS;
	int pp = 15;
	int maxPP = 24;
	int power = 0;
	int accuracy = 80;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		target.setStageAccuracy(target.getStageAccuracy()-1);
	}
}
