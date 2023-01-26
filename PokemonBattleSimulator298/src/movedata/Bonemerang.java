package movedata;
import core.*;

public class Bonemerang extends Move
{
	public Bonemerang() 
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
	int id = Names.moveNames.BONEMERANG.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GROUND;
	int category = Move.PHYSICAL;
	int pp = 10;
	int maxPP = 16;
	int power = 50;
	int accuracy = 90;
	int priority = 0;
	
	boolean contact = false;
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
