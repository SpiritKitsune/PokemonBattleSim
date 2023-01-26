package movedata;
import java.util.concurrent.ThreadLocalRandom;

import core.*;

public class SkyAttack extends Move
{
	public SkyAttack() 
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
	int id = Names.moveNames.SKY_ATTACK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FLYING;
	int category = Move.PHYSICAL;
	int pp = 5;
	int maxPP = 8;
	int power = 140;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(user.getForceMove() instanceof SkyAttack)
		{
			user.updateStatusVolatileBattle(Status.GLOWING, false);
			if(ThreadLocalRandom.current().nextInt(9) <= 2)
			{
				if(Status.canStatusVolatile(user, target, Status.FLINCH))
				{
					target.updateStatusVolatile(Status.FLINCH, true);
				}
			}
		}
		else
		{
			if(Status.canStatusVolatileBattle(user, target, Status.GLOWING))
			{
				BattleHandler.getPlayerMove().addPP(1);
				user.updateStatusVolatileBattle(Status.GLOWING, true);
				BattleHandler.setForceMove(true);
				BattleHandler.setGenericDamageToDeal(0);
			}
		}
	}
}
