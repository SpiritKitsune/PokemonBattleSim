package movedata;
import core.*;

public class Absorb extends Move
{
	public Absorb() 
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
	int id = Names.moveNames.ABSORB.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GRASS;
	int category = Move.SPECIAL;
	int pp = 25;
	int maxPP = 40;
	int power = 20;
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
		if(target.getCurrentHP() >= BattleHandler.getGenericDamageToDeal())
		{
			BattleHandler.heal(user, BattleHandler.getGenericDamageToDeal()/2);
		}
		else
		{
			BattleHandler.heal(user, (int) (target.getCurrentHP()/2));
		}
	}
}
