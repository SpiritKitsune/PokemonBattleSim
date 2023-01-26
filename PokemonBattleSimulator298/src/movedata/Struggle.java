package movedata;
import core.*;

public class Struggle extends Move
{
	public Struggle() 
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
	int id = Names.moveNames.STRUGGLE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.PHYSICAL;
	int pp = 1;
	int maxPP = 1;
	int power = 50;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = true;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		BattleHandler.dealDamage(user, (int) (user.getHp()/4));
	}
}
