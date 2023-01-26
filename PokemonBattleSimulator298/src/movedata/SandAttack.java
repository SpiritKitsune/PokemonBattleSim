package movedata;
import core.*;

public class SandAttack extends Move
{
	public SandAttack() 
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
	int id = Names.moveNames.SAND_ATTACK.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.GROUND;
	int category = Move.STATUS;
	int pp = 15;
	int maxPP = 24;
	int power = 0;
	int accuracy = 100;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = true;
	boolean magicCoat = true;
	boolean snatch = false;
	boolean mirrorMove = true;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		target.setStageAccuracy(target.getStageAccuracy()-1);
	}
}
