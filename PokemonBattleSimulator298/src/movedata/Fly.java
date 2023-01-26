package movedata;
import core.*;

public class Fly extends Move
{
	public Fly() 
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
	int id = Names.moveNames.FLY.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FLYING;
	int category = Move.PHYSICAL;
	int pp = 15;
	int maxPP = 24;
	int power = 90;
	int accuracy = 95;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(user.getForceMove() instanceof Fly)
		{
			user.updateStatusVolatileBattle(Status.SEMI_INVULNERABLE, false);
		}
		else
		{
			if(Status.canStatusVolatileBattle(user, target, Status.SEMI_INVULNERABLE))
			{
				BattleHandler.getPlayerMove().addPP(1);
				user.updateStatusVolatileBattle(Status.SEMI_INVULNERABLE, true);
				BattleHandler.setForceMove(true);
				BattleHandler.setGenericDamageToDeal(0);
			}
		}
	}
}
