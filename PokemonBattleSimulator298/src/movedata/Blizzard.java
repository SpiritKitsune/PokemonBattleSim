package movedata;
import core.*;

public class Blizzard extends Move
{

	public Blizzard() 
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
	int id = Names.moveNames.BLIZZARD.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.ICE;
	int category = Move.SPECIAL;
	int pp = 5;
	int maxPP = 8;
	int power = 110;
	int accuracy = 70;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPre(Pokemon attacker, Pokemon defender)
	{
		if(Weather.getCurrentWeather() == Weather.HAIL)
		{
			setAccuracy(0);
		}
	}
	
	public void effectPost(Pokemon attacker, Pokemon defender)
	{
		setAccuracy(70);
	}
}
