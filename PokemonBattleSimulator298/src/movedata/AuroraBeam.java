package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class AuroraBeam extends Move
{
	public AuroraBeam() 
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
	int id = Names.moveNames.AURORA_BEAM.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ICE;
	int category = Move.SPECIAL;
	int pp = 20;
	int maxPP = 32;
	int power = 65;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(ThreadLocalRandom.current().nextInt(9) == 0)
		{
			target.setStageAttack(target.getStageAttack()-1);
		}
	}
}
