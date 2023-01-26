package movedata;
import core.*;

public class Dig extends Move
{
	public Dig() 
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
	int id = Names.moveNames.DIG.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GROUND;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 80;
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
		if(user.getForceMove() instanceof Dig)
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
