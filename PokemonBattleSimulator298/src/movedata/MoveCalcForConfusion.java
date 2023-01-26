package movedata;
import core.*;

public class MoveCalcForConfusion extends Move
{
	public MoveCalcForConfusion() 
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
	int id = Names.moveNames.NONE.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.NONE;
	int category = Move.PHYSICAL;
	int pp = 1;
	int maxPP = 1;
	int power = 40;
	int accuracy = 0;
	int priority = 0;
	
	boolean contact = false;
	boolean protect = false;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
}
