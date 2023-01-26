package core;

public class CurrentSimData 
{
	static Pokemon[] playerPKMN = new Pokemon[6];
	static Pokemon[] opponentPKMN = new Pokemon[6];
	static int currentPokemonPlayer = 0;
	static int currentPokemonOpponent = 0;
	public static Pokemon[] getPlayerPKMN() {
		return playerPKMN;
	}
	public void setPlayerPKMN(Pokemon[] playerPKMN) {
		CurrentSimData.playerPKMN = playerPKMN;
	}
	public static Pokemon[] getOpponentPKMN() {
		return opponentPKMN;
	}
	public void setOpponentPKMN(Pokemon[] opponentPKMN) {
		CurrentSimData.opponentPKMN = opponentPKMN;
	}
	
	public static Pokemon getPokemonFromTeam(Pokemon[] team, int pkmnPosition)
	{
		return team[pkmnPosition];
	}
	
	public static void updateMove(Pokemon pkmn, int movePosition, Move aMove)
	{
		pkmn.moveSet[movePosition] = aMove;
	}
	
	public static Pokemon getCurrentPokemonPlayer()
	{
		return getPokemonFromTeam(playerPKMN, currentPokemonPlayer);
	}
	
	public static void setCurrentPokemonPlayer(int pkmnPosition)
	{
		currentPokemonPlayer = pkmnPosition;
	}
	
	public static Pokemon getCurrentPokemonOpponent()
	{
		return getPokemonFromTeam(opponentPKMN, currentPokemonOpponent);
	}
	
	public static void setCurrentPokemonOpponent(int pkmnPosition)
	{
		currentPokemonOpponent = pkmnPosition;
	}
}
