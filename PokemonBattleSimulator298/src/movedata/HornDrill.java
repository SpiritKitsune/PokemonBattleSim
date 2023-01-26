package movedata;
import core.*;

public class HornDrill extends Move
{
	public HornDrill() 
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
	int id = Names.moveNames.HORN_DRILL.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 5;
	int maxPP = 8;
	int power = 0;
	int accuracy = 30;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
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
