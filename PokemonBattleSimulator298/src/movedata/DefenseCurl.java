package movedata;
import core.*;

public class DefenseCurl extends Move
{
	public DefenseCurl() 
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
	int id = Names.moveNames.DEFENSE_CURL.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.STATUS;
	int pp = 40;
	int maxPP = 64;
	int power = 0;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = false;
	boolean magicCoat = false;
	boolean snatch = true;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(Status.canStatusVolatileBattle(user, target, Status.DEFENSE_CURL))
		{
			target.updateStatusVolatileBattle(Status.DEFENSE_CURL, true);
		}
	}
}
