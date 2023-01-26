package movedata;
import core.*;

public class LeechLife extends Move
{
	public LeechLife() 
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
	int id = Names.moveNames.LEECH_LIFE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.BUG;
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
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
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
