package movedata;
import core.*;

public class Substitute extends Move
{
	public Substitute()
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

	int id = Names.moveNames.SUBSTITUTE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.STATUS;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = false;
	boolean magicCoat = false;
	boolean snatch = true;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(Status.canStatusVolatileBattle(user, target, Status.SUBSTITUTE))
		{
			user.updateStatusVolatileBattle(Status.SUBSTITUTE, true);
		}
		if(user.getStatusVolatileBattle()[Status.SUBSTITUTE])
		{
			user.setName("Substitute");
			user.setSprite("substitute1.png");
			user.setHp(user.getHp()/4);
			user.setCurrentHP(user.getHp());
		}
	}
}
