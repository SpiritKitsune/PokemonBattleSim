package movedata;
import core.*;

public class HyperBeam extends Move
{
	public HyperBeam() 
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
	int id = Names.moveNames.HYPER_BEAM.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.SPECIAL;
	int pp = 5;
	int maxPP = 8;
	int power = 150;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(Status.canStatusVolatileBattle(user, target, Status.RECHARGING))
		{
			user.updateStatusVolatileBattle(Status.RECHARGING, true);
		}
	}
}
