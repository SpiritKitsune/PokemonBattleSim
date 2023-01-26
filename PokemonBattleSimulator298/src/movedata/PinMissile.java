package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class PinMissile extends Move
{
	public PinMissile() 
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
	int id = Names.moveNames.PIN_MISSILE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.BUG;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 25;
	int accuracy = 95;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		double random = ThreadLocalRandom.current().nextDouble();
		if(random <= .333)
		{
			BattleHandler.setTimesToHit(2);
		}
		else if(random <= .666)
		{
			BattleHandler.setTimesToHit(3);
		}
		else if(random <=.833)
		{
			BattleHandler.setTimesToHit(4);
		}
		else if(random <= 1.0)
		{
			BattleHandler.setTimesToHit(5);
		}
		else
		{
			BattleHandler.setTimesToHit(1); //Something went wrong
		}
	}
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		BattleHandler.setTimesToHit(1);
	}
}
