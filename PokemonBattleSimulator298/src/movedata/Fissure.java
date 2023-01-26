package movedata;
import core.*;

public class Fissure extends Move
{
	public Fissure() 
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
	int id = Names.moveNames.FISSURE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GROUND;
	int category = Move.PHYSICAL;
	int pp = 5;
	int maxPP = 8;
	int power = 0;
	int accuracy = 30;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		BattleHandler.setCalculatedAccuracy((user.getLevel() - target.getLevel()+ 30)/100);
	}
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(BattleHandler.isGenericDoesHit())
		{
			BattleHandler.setGenericDamageToDeal((int) target.getCurrentHP());
		}
		else
		{
			BattleHandler.setGenericDamageToDeal(0);
		}
	}
}
