package movedata;
import core.*;

public class Bulldoze extends Move
{
	public Bulldoze() 
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
	int id = Names.moveNames.BULLDOZE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GROUND;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 60;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		target.setStageSpeed(target.getStageSpeed()-1);
	}
}
