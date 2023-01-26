package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class Psywave extends Move
{
	public Psywave() 
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
	int id = Names.moveNames.PSYWAVE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.PSYCHIC;
	int category = Move.SPECIAL;
	int pp = 15;
	int maxPP = 24;
	int power = 0;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		BattleHandler.setGenericDamageToDeal((int) ((ThreadLocalRandom.current().nextDouble()+.5)*user.getLevel()));
	}
}
