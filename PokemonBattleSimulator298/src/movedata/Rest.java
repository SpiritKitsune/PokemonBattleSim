package movedata;
import core.*;

public class Rest extends Move
{
	public Rest() 
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
	int id = Names.moveNames.REST.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.PSYCHIC;
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
		if(user.getStatusNonVolatile()!= Status.SLEEP
				&& user.getCurrentHP() != user.getHp())
		{
			user.setStatusNonVolatile(Status.SLEEP);
			user.setSleepCounter(3);
			BattleHandler.heal(user, (int) user.getHp());
		}
	}
}
