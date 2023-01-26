package movedata;
import core.*;

public class DoubleKick extends Move
{
	public DoubleKick() 
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
	int id = Names.moveNames.DOUBLE_KICK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FIGHTING;
	int category = Move.PHYSICAL;
	int pp = 30;
	int maxPP = 48;
	int power = 30;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = true;
	
	public void effectPre(Pokemon user, Pokemon target)
	{
		BattleHandler.setTimesToHit(2);
	}
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		BattleHandler.setTimesToHit(1);
	}
}
