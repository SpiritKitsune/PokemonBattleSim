package movedata;
import core.*;

public class DragonRage extends Move
{
	public DragonRage() 
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
	int id = Names.moveNames.DRAGON_RAGE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.DRAGON;
	int category = Move.SPECIAL;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
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
		if(BattleHandler.isGenericDoesHit()
				&& target.getType1() != TypeTable.FAIRY
				&& target.getType2() != TypeTable.FAIRY)
		{
			BattleHandler.setGenericDamageToDeal(40);
		}
		else
		{
			BattleHandler.setGenericDamageToDeal(0);
		}
	}
}
