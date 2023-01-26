package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class Thunder extends Move
{
	public Thunder() 
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
	int id = Names.moveNames.THUNDER.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ELECTRIC;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 110;
	int accuracy = 70;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		if(Weather.getCurrentWeather() == Weather.RAIN)
		{
			setAccuracy(0);
		}
		else if(Weather.getCurrentWeather() == Weather.HARSH_SUNLIGHT)
		{
			setAccuracy(50);
		}
		else
		{
			setAccuracy(70);
		}
	}
	
	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(ThreadLocalRandom.current().nextInt(9) <= 2)
		{
			if(Status.canStatusNonVolatile(target, Status.PARALYSIS))
			{
				target.setStatusNonVolatile(Status.PARALYSIS);
			}
		}
	}
}
