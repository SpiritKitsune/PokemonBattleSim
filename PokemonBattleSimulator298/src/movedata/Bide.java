package movedata;
import core.*;

public class Bide extends Move
{
	public Bide()
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

	int id = Names.moveNames.BIDE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
	int accuracy = 0;
	int priority = 1;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = true;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		if(user.getForceMove() instanceof Bide && user.getBideCounter() > 0)
		{
			user.setBideCounter(user.getBideCounter()-1);
		}
		else if(user.getBideCounter() == 0)
		{
			user.setBideCounter(2);//TODO come back to this
		}
	}
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(user.getForceMove() instanceof Bide)
		{
			user.setStoredDamage(user.getStoredDamage() + user.getLastDamageTaken());
			if(user.getBideCounter() == 0)
			{
				BattleHandler.setGenericDamageToDeal(user.getStoredDamage());
				BattleHandler.setForceMove(false);
			}
			else
			{
				BattleHandler.setForceMove(true);
			}
		}
	}
}
