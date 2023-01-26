package movedata;
import core.*;

public class Counter extends Move
{
	public Counter() 
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
	int id = Names.moveNames.COUNTER.ordinal();
	String name = Names.fullMoveNames[id];
	int moveType = TypeTable.FIGHTING;
	int category = Move.PHYSICAL;
	int pp = 20;
	int maxPP = 32;
	int power = 0;
	int accuracy = 100;
	int priority = -5;
	
	boolean contact = true;
	boolean protect = true;
	boolean magicCoat = false;
	boolean snatch = false;
	boolean mirrorMove = false;
	boolean kingsRock = false;
	
	public void effectPost(Pokemon user, Pokemon target)
	{
		if(BattleHandler.isFirstHasAttacked() && BattleHandler.isFirstDidHit())
		{
			int i = 0;
			while(i < target.getMoveSet().length)
			{
				if(target.getMoveFromPokemon(i).getCategory() == Move.PHYSICAL)
				{
					BattleHandler.setGenericDamageToDeal(user.getLastDamageTaken()*2);
					break;
				}
				i++;
			}
		}
		else
		{
			BattleHandler.setGenericDamageToDeal(0);
		}
	}
}
