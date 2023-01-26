package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class PetalDance extends Move
{
	public PetalDance() 
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
	int id = Names.moveNames.PETAL_DANCE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GRASS;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 120;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(user.getForceMove() instanceof PetalDance)
		{
			if(user.getMoveRepeatCounter() > 0)
			{
				user.setMoveRepeatCounter(user.getMoveRepeatCounter()-1);
			}
			if(user.getMoveRepeatCounter() == 0 || !BattleHandler.isGenericDoesHit())
			{
				if(Status.canStatusVolatileBattle(user, user, Status.CONFUSED))
				{
					Status.setConfusionCounters(user);
					user.updateStatusVolatileBattle(Status.CONFUSED, true);
				}
			}
		}
		else if(user.getMoveRepeatCounter() == 0)
		{
			user.setMoveRepeatCounter(ThreadLocalRandom.current().nextInt(2,3));
			BattleHandler.setForceMove(true);
		}
	}
}
