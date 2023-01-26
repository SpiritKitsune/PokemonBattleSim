package movedata;
import core.*;

public class Growth extends Move
{
	public Growth() 
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
	int id = Names.moveNames.GROWTH.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.STATUS;
	int pp = 20;
	int maxPP = 32;
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
		if(Weather.getCurrentWeather() == Weather.HARSH_SUNLIGHT)
		{
			user.setStageAttack(user.getStageAttack()+2);
			user.setStageSpAttack(user.getStageSpAttack()+2);
		}
		else
		{
			user.setStageAttack(user.getStageAttack()+1);
			user.setStageSpAttack(user.getStageSpAttack()+1);
		}
	}
}
