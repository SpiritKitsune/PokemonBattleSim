package core;

public class TypeTable 
{
	public static final int NORMAL = 0;
	public static final int FIRE = 1;
	public static final int WATER = 2;
	public static final int GRASS = 3;
	public static final int ELECTRIC = 4;
	public static final int ICE = 5;
	public static final int FIGHTING = 6;
	public static final int POISON = 7;
	public static final int GROUND = 8;
	public static final int FLYING = 9;
	public static final int PSYCHIC = 10;
	public static final int BUG = 11;
	public static final int ROCK = 12;
	public static final int GHOST = 13;
	public static final int DRAGON = 14;
	public static final int DARK = 15;
	public static final int STEEL = 16;
	public static final int FAIRY = 17;
	public static final int NONE = 18;
	
	public static final double NE = 1;	//Normal Effectiveness
	public static final double SE = 2;	//Super Effective
	public static final double NV = .5;	//Not Very Effective
	public static final double ND = 0; 	//No Damage
	public static double[][] matchups = new double[][]
			{
			   /*N |F |W |G |E |I |F |P |G |F |P |B |R |G |D |D |S |F |N
				*o |i |a |r |l |c |i |o |r |l |s |u |o |h |r |a |t |a |o
				*r |r |t |a |e |e |g |i |o |y |y |g |c |o |a |r |e |i |n
				*m |e |e |s |c |  |h |s |u |i |c |  |k |s |g |k |e |r |e
				*a |  |r |s |t |  |t |o |n |n |h |  |  |t |o |  |l |y |
				*l |  |  |  |r |  |i |n |d |g |i |  |  |  |n |  |  |  |
				*  |  |  |  |i |  |n |  |  |  |c |  |  |  |  |  |  |  |
				*  |  |  |  |c |  |g |  |  |  |  |  |  |  |  |  |  |  |
				*/       
	/*Normal*/	{NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NV,ND,NE,NE,NV,NE,NE},
	/*Fire*/	{NE,NV,NV,SE,NE,SE,NE,NE,NE,NE,NE,SE,NV,NE,NV,NE,SE,NE,NE},
	/*Water*/	{NE,SE,NV,NV,NE,NE,NE,NE,SE,NE,NE,NE,SE,NE,NV,NE,NE,NE,NE},
	/*Grass*/	{NE,NV,SE,NV,NE,NE,NE,NV,SE,NV,NE,NV,SE,NE,NV,NE,NV,NE,NE},
	/*Electric*/{NE,NE,SE,NV,NV,NE,NE,NE,ND,SE,NE,NE,NE,NE,NV,NE,NE,NE,NE},
	/*Ice*/		{NE,NV,NV,SE,NE,NV,NE,NE,SE,SE,NE,NE,NE,NE,SE,NE,NV,NE,NE},
	/*Fighting*/{SE,NE,NE,NE,NE,SE,NE,NV,NE,NV,NV,NV,SE,ND,NE,SE,SE,NV,NE},
	/*Poison*/	{NE,NE,NE,SE,NE,NE,NE,NV,NV,NE,NE,NE,NV,NV,NE,NE,ND,SE,NE},
	/*Ground*/	{NE,SE,NE,NV,SE,NE,NE,SE,NE,ND,NE,NV,SE,NE,NE,NE,SE,NE,NE},
	/*Flying*/	{NE,NE,NE,SE,NV,NE,SE,NE,NE,NE,NE,SE,NV,NE,NE,NE,NV,NE,NE},
	/*Psychic*/	{NE,NE,NE,NE,NE,NE,SE,SE,NE,NE,NV,NE,NE,NE,NE,ND,NV,NE,NE},
	/*Bug*/		{NE,NV,NE,SE,NE,NE,NV,NV,NE,NV,SE,NE,NE,NV,NE,SE,NV,NV,NE},
	/*Rock*/	{NE,SE,NE,NE,NE,SE,NV,NE,NV,SE,NE,SE,NE,NE,NE,NE,NV,NE,NE},
	/*Ghost*/	{ND,NE,NE,NE,NE,NE,NE,NE,NE,NE,SE,NE,NE,SE,NE,NV,NE,NE,NE},
	/*Dragon*/	{NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,SE,NE,NV,ND,NE},
	/*Dark*/	{NE,NE,NE,NE,NE,NE,NV,NE,NE,NE,SE,NE,NE,SE,NE,NV,NE,NV,NE},
	/*Steel*/	{NE,NV,NV,NE,NV,SE,NE,NE,NE,NE,NE,NE,SE,NE,NE,NE,NV,SE,NE},
	/*Fairy*/	{NE,NV,NE,NE,NE,NE,SE,NV,NE,NE,NE,NE,NE,NE,SE,SE,NV,NE,NE},
	/*None*/	{NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE,NE}
			};
	
	public static double calcMultiplier(int atkType, int defType, Pokemon target)
	{
		double multiplier = matchups[atkType][defType];
		
		if(target.getStatusVolatile()[Status.IDENTIFIED])
		{
			if(((atkType == NORMAL || atkType == FIGHTING)
					&& defType == GHOST)
					|| atkType == PSYCHIC && defType == DARK)
			{
				multiplier = NE; //TODO Add specifics, MUST ONLY BE Foresight, Odor Sleuth, or Miracle Eye
			}
		}
		
		if(target.getStatusVolatileBattle()[Status.ROOTING])
		{
			if(atkType == GROUND && defType == FLYING)
			{
				multiplier = NE;
			}
		}
		return multiplier;
		
	};
}
