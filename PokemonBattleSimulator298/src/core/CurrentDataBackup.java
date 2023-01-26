package core;

public class CurrentDataBackup 
{
	static Pokemon[] playerPKMN = new Pokemon[6];
	static Pokemon[] opponentPKMN = new Pokemon[6];
	
	public static Pokemon[] getPlayerPKMN() {
		return playerPKMN;
	}
	public void setPlayerPKMN(Pokemon[] playerPKMN) {
		CurrentDataBackup.playerPKMN = playerPKMN;
	}
	public static Pokemon[] getOpponentPKMN() {
		return opponentPKMN;
	}
	public void setOpponentPKMN(Pokemon[] opponentPKMN) {
		CurrentDataBackup.opponentPKMN = opponentPKMN;
	}
	
	public static Pokemon getPokemonFromTeam(Pokemon[] team, int pkmnPosition)
	{
		return team[pkmnPosition];
	}
	
	public static void updateMove(Pokemon[] team, int pkmnPosition, int movePosition, Move aMove)
	{
		team[pkmnPosition].moveSet[movePosition] = aMove;
	}
}
