package movedata;
import core.*;

public class RazorWind extends Move
{
	public RazorWind() 
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
	int id = Names.moveNames.RAZOR_WIND.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 80;
	int accuracy = 100;
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
		if(Status.canStatusVolatileBattle(user, target, Status.WHIPPING_UP_A_WHIRLWIND))
		{
			user.updateStatusVolatileBattle(Status.WHIPPING_UP_A_WHIRLWIND, true);
		}
	}
}
