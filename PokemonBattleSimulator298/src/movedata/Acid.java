package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class Acid extends Move
{
	public Acid() 
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
	int id = Names.moveNames.ACID.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.POISON;
	int category = Move.SPECIAL;
	int pp = 30;
	int maxPP = 48;
	int power = 40;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon attacker, Pokemon defender)
	{
		if(ThreadLocalRandom.current().nextInt(9) == 0)
		{
			defender.setStageSpDefense(defender.getStageSpDefense()-1);
		}
	}
}
