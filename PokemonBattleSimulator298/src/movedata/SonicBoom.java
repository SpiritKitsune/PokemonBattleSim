package movedata;
import core.*;

public class SonicBoom extends Move
{
	public SonicBoom() 
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
	int id = Names.moveNames.SONIC_BOOM.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.SPECIAL;
	int pp = 20;
	int maxPP = 32;
	int power = 0;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(BattleHandler.isGenericDoesHit())
		{
			BattleHandler.setGenericDamageToDeal(20);
		}
		else
		{
			BattleHandler.setGenericDamageToDeal(0);
		}
	}
}
