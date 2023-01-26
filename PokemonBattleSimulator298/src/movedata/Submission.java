package movedata;
import core.*;

public class Submission extends Move
{
	public Submission() 
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
	int id = Names.moveNames.SUBMISSION.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FIGHTING;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 80;
	int accuracy = 80;
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
