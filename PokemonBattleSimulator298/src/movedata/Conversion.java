package movedata;
import core.*;

public class Conversion extends Move
{
	public Conversion() 
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
	int id = Names.moveNames.CONVERSION.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.STATUS;
	int pp = 30;
	int maxPP = 48;
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
		user.setType1(user.getMoveFromPokemon(0).getMoveType());
		user.setType2(TypeTable.NONE);
		//TODO When does this wear off?
		//TODO update type display
	}
}
