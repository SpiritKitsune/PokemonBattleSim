package movedata;
import core.*;

public class TakeDown extends Move
{
	public TakeDown() 
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
	int id = Names.moveNames.TAKE_DOWN.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 90;
	int accuracy = 85;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(BattleHandler.getGenericDamageToDeal() > target.getCurrentHP())
		{
			BattleHandler.dealDamage(user, (int) (target.getCurrentHP()/4));
		}
		else
		{
			BattleHandler.dealDamage(user, BattleHandler.getGenericDamageToDeal()/4);
		}
	}
}
