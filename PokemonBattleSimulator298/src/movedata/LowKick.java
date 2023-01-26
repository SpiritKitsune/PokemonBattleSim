package movedata;
import core.*;

public class LowKick extends Move
{
	public LowKick() 
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
	int id = Names.moveNames.LOW_KICK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FIGHTING;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 0;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		if(target.getWeight() >= 200)
		{
			setPower(120);
		}
		else if(target.getWeight() >= 100)
		{
			setPower(100);
		}
		else if(target.getWeight() >= 50)
		{
			setPower(80);
		}
		else if(target.getWeight() >= 25)
		{
			setPower(60);
		}
		else if(target.getWeight() >= 10)
		{
			setPower(40);
		}
		else
		{
			setPower(20);
		}
	}
}
