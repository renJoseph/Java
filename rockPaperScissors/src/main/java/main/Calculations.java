package main;

public class Calculations {
	
	
	public void findPlayerWPerc(int playerWins, int gamesPlayed) {
		float playerWinPerc = Math.round((playerWins * 100) / gamesPlayed);
		System.out.print("Player win percentage: " +  playerWinPerc + "%, ");
	}
	
	public void findComputerWPerc(int computerWins, int gamesPlayed) {
		float computerWinPerc = Math.round((computerWins * 100) / gamesPlayed);
		System.out.print("Computer win percentage: " + computerWinPerc + "%, ");
	}
	
	public void findTiePerc(int ties, int gamesPlayed) {
		float tiePerc = Math.round((ties * 100) / gamesPlayed);
		System.out.print("Ties: " + tiePerc + "%");
	}
}
