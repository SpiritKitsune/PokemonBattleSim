package movedata;
import core.*;

public class Brine extends Move
{
	public Brine() 
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
	int id = Names.moveNames.BRINE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.WATER;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 65;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		if(target.getCurrentHP() <= .5*target.getHp())
		{
			setPower(130);
		}
	}
	public void effectPost(Pokemon user, Pokemon target)
	{
		setPower(65);
	}
}
