package movedata;
import core.*;

public class SkullBash extends Move
{
	public SkullBash() 
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
	int id = Names.moveNames.SKULL_BASH.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 130;
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
		if(user.getForceMove() instanceof SkullBash)
		{
			user.updateStatusVolatileBattle(Status.WITHDRAWING, false);
		}
		else
		{
			if(Status.canStatusVolatileBattle(user, target, Status.WITHDRAWING))
			{
				BattleHandler.getPlayerMove().addPP(1);
				user.setStageDefense(user.getStageDefense()+1); //TODO does this wear off
				user.updateStatusVolatileBattle(Status.WITHDRAWING, true);
				BattleHandler.setForceMove(true);
				BattleHandler.setGenericDamageToDeal(0);
			}
		}
	}
}
