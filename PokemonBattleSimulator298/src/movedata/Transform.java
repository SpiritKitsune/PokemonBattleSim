package movedata;
import core.*;

public class Transform extends Move
{
	public Transform() 
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
	int id = Names.moveNames.TRANSFORM.ordinal();
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
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		user.setName(target.getName());
		user.setSprite(target.getSprite());		
		user.setType1(target.getType1());
		user.setType2(target.getType2());
		user.setAttack(target.getAttack());
		user.setDefense(target.getDefense());
		user.setSpAttack(target.getSpAttack());
		user.setSpDefense(target.getSpDefense());
		user.setSpeed(target.getSpeed());
		user.setHp(target.getHp());
		user.setCurrentHP(target.getCurrentHP());
		user.setCritLevel(target.getCritLevel());
		user.setStageAttack(target.getStageAttack());
		user.setStageDefense(target.getStageDefense());
		user.setStageSpAttack(target.getStageSpAttack());
		user.setStageSpDefense(target.getStageSpDefense());
		user.setStageSpeed(target.getStageSpeed());
		user.setStageAccuracy(target.getStageAccuracy());
		user.setStageEvasion(target.getStageEvasion());
		user.setWeight(target.getWeight());
		user.setGender(target.getGender());
		user.setMoveSet(target.getMoveSet());
		
		int i = 0;
		while(i < 4)
		{
			if(user.getMoveSet()[i].getMaxPP() >= 5)
			{
				user.getMoveSet()[i].setCurrentPP(5);
			}
			else
			{
				user.getMoveSet()[i].setCurrentPP(user.getMoveSet()[i].getMaxPP());
			}
			i++;
		}
	}
}
