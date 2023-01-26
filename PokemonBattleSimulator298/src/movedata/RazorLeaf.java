package movedata;
import core.*;

public class RazorLeaf extends Move
{
	public RazorLeaf() 
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
	int id = Names.moveNames.RAZOR_LEAF.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GRASS;
	int category = Move.PHYSICAL;
	int pp = 25;
	int maxPP = 40;
	int power = 55;
	int accuracy = 95;
	int priority = 0;
	
	boolean contact = false;
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
