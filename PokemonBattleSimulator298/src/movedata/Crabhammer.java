package movedata;
import core.*;

public class Crabhammer extends Move
{
	public Crabhammer()
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

	int id = Names.moveNames.CRABHAMMER.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.WATER;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 100;
	int accuracy = 90;
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
