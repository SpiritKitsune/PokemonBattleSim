package core;

public class Weather 
{
	public static final int CLEAR = 0;
	public static final int HARSH_SUNLIGHT = 1;
	public static final int EXTREMELY_HARSH_SUNLIGHT = 2;
	public static final int RAIN = 3;
	public static final int HEAVY_RAIN = 4;
	public static final int SANDSTORM = 5;
	public static final int HAIL = 6;
	public static final int DIAMOND_DUST = 7;
	public static final int SHADOWY_AURA = 8;
	public static final int FOG = 9;
	public static final int MYSTERIOUS_AIR_CURRENT = 10;
	
	static int currentWeather = CLEAR;

	public static int getCurrentWeather() {
		return currentWeather;
	}

	public static void setCurrentWeather(int currentWeather) {
		Weather.currentWeather = currentWeather;
	}
	
}
