package movedata;
import core.*;

public class Slash extends Move
{
	public Slash()
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

	int id = Names.moveNames.SLASH.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 70;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;

	
	public void effectPre (Pokemon user, Pokemon target)
	{
		user.setCritLevel(user.getCritLevel()+1);
	}
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		user.setCritLevel(user.getCritLevel()-1);
	}
}
