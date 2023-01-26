package movedata;
import core.*;

public class DreamEater extends Move
{
	public DreamEater() 
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
	int id = Names.moveNames.DREAM_EATER.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.PSYCHIC;
	int category = Move.SPECIAL;
	int pp = 15;
	int maxPP = 24;
	int power = 100;
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
		if(target.getStatusNonVolatile() == Status.SLEEP)
		{
			if(BattleHandler.getGenericDamageToDeal() > target.getCurrentHP())
			{
				BattleHandler.heal(user, (int) (target.getCurrentHP()/2));
			}
			else
			{
				BattleHandler.heal(user, BattleHandler.getGenericDamageToDeal()/2);
			}
		}
	}
}
