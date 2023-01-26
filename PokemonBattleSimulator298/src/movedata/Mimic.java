package movedata;
import core.*;

public class Mimic extends Move
{
	public Mimic() 
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
	int id = Names.moveNames.MIMIC.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NORMAL;
	int category = Move.STATUS;
	int pp = 10;
	int maxPP = 16;
	int power = 0;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		int i = 0;
		while(i < user.getMoveSet().length)
		{
			if(user.getMoveFromPokemon(i) instanceof Mimic)
			{
				CurrentSimData.updateMove(user, i, target.getLastMove());
				break;
			}
			i++;
		}
	}
}
