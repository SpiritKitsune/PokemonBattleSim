package movedata;
import core.*;

public class LeechSeed extends Move
{
	public LeechSeed() 
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
	int id = Names.moveNames.LEECH_SEED.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GRASS;
	int category = Move.STATUS;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(Status.canStatusVolatile(user, target, Status.LEECH_SEED))
		{
			target.updateStatusVolatile(Status.LEECH_SEED, true);
		}
	}
}
