package movedata;
import core.*;

public class SolarBeam extends Move
{
	public SolarBeam() 
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
	int id = Names.moveNames.SOLAR_BEAM.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GRASS;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 120;
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
		if(user.getForceMove() instanceof SolarBeam)
		{
			user.updateStatusVolatileBattle(Status.TAKING_IN_SUNLIGHT, false);
		}
		else
		{
			if(Status.canStatusVolatileBattle(user, target, Status.TAKING_IN_SUNLIGHT))
			{
				BattleHandler.getPlayerMove().addPP(1);
				user.updateStatusVolatileBattle(Status.TAKING_IN_SUNLIGHT, true);
				BattleHandler.setForceMove(true);
				BattleHandler.setGenericDamageToDeal(0);
			}
		}
	}
}
