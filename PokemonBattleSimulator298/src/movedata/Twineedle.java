package movedata;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.BadLocationException;

import core.*;

public class Twineedle extends Move
{
	public Twineedle() 
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
	int id = Names.moveNames.TWINEEDLE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.BUG;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 25;
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
		BattleHandler.setTimesToHit(2);
	}
	
	public void effectPost(Pokemon user, Pokemon target) throws BadLocationException
	{
		if(ThreadLocalRandom.current().nextInt(9) <= 1)
		{
			if(Status.canStatusNonVolatile(target, Status.POISON))
			{
				target.setStatusNonVolatile(Status.POISON);
			}
		}
		BattleHandler.setTimesToHit(1);
	}
}
