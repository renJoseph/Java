package main;

import java.util.Random;
import java.util.Scanner;

public class GameManager {

	int gamesPlayed = 0;
	int playerWins = 0;
	int computerWins = 0;
	int ties = 0;
	float computerWinPerc;
	float tiePerc;
	boolean quit = false;
	int rocksPicked;
	int papersPicked;
	int scissorsPicked;
	Random r = new Random();
	Calculations c = new Calculations();

	public void Play() {
		Scanner input = new Scanner(System.in);
		while ((gamesPlayed - ties) < 10) {

			if (gamesPlayed >= 1) {
				c.findPlayerWPerc(playerWins, gamesPlayed);
				c.findComputerWPerc(computerWins, gamesPlayed);
				c.findTiePerc(ties, gamesPlayed);
			}
			System.out.println("");
			System.out.println("Games Played: " + gamesPlayed + " | Player " + playerWins + " : " + computerWins
					+ " Computer" + " | Ties : " + ties);

			System.out.println("Input: '0' for rock | '1' for paper | '2' for scissors | '3' to quit");

			int a = input.nextInt();
			int x = r.nextInt(3);

			if (a == 3) {
				quit = true;

			} else if (a == 0) {
				rock(x);

			} else if (a == 1) {
				paper(x);

			} else {
				scissors(x);
			}
		}
		input.close();
	}

	public void rock(int x) {
		rocksPicked++;
		if (x == 0) {
			System.out.println("Your rocks collide! You Drew!");
			gamesPlayed++;
			ties++;

		} else if (x == 1) {
			System.out.println("Their paper covered your rock! You Lose!");
			gamesPlayed++;
			computerWins++;
		} else {
			System.out.println("Your rock crushed their scissors! You Win!");
			gamesPlayed++;
			playerWins++;
		}

	}

	public void paper(int x) {
		papersPicked++;
		if (x == 0) {
			System.out.println("Your paper covers their rock! You Win!");
			gamesPlayed++;
			playerWins++;
		} else if (x == 1) {
			System.out.println("You gave each other paper cuts! You Drew!");
			gamesPlayed++;
			ties++;
		} else {
			System.out.println("Their scissors cut your paper! You Lose!");
			gamesPlayed++;
			computerWins++;
		}

	}

	public void scissors(int x) {
		scissorsPicked++;
		if (x == 0) {
			System.out.println("Your scissors are crushed by their rock! You Lose!");
			gamesPlayed++;
			computerWins++;
		} else if (x == 1) {
			System.out.println("Your scissors cut their paper! You Win!");
			gamesPlayed++;
			playerWins++;
		} else {
			System.out.println("You scissor eachother, it's hot! You drew tho :c!");
			gamesPlayed++;
			ties++;
		}
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getPlayerWins() {
		return playerWins;
	}

	public void setPlayerWins(int playerWins) {
		this.playerWins = playerWins;
	}

	public int getComputerWins() {
		return computerWins;
	}

	public void setComputerWins(int computerWins) {
		this.computerWins = computerWins;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public float getComputerWinPerc() {
		return computerWinPerc;
	}

	public void setComputerWinPerc(float computerWinPerc) {
		this.computerWinPerc = computerWinPerc;
	}

	public float getTiePerc() {
		return tiePerc;
	}

	public void setTiePerc(float tiePerc) {
		this.tiePerc = tiePerc;
	}

	public boolean isQuit() {
		return quit;
	}

	public void setQuit(boolean quit) {
		this.quit = quit;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

}
