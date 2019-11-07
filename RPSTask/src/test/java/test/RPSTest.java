package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import main.GameManager;

public class RPSTest {

	GameManager gM = new GameManager();

	Random r = new Random();

	@Test
	public void testRock() {
		int x = 2;
		gM.rock(x);
		assertEquals("Not giving proper outcome", true, gM.getPlayerWins() == 1);
	}

	@Test
	public void testPaper() {
		int x = 0;
		gM.paper(x);
		assertEquals("Not giving proper outcome", true, gM.getPlayerWins() == 1);
	}

	@Test
	public void testScissors() {
		int x = 1;
		gM.scissors(x);
		assertEquals("Not giving proper outcome", true, gM.getPlayerWins() == 1);
	}

	@Test
	public void testTotalGamesPlayed() {
		int x = 0;
		gM.rock(x);
		assertEquals("Returns incorrect value for total games played", true, gM.getGamesPlayed() == 1);
	}

	@Test
	public void testComputerWins() {
		int x = 0;
		gM.scissors(x);
		assertEquals("Returns incorrect value for computer wins", true, gM.getComputerWins() == 1);
	}

	// @Test
	// public void testComputerWinsPercentage() {
	// assertEquals("Returns incorrect value for computer win percentage", x,
	// gM.computerWinPerc());
	// }
	@Test
	public void testPlayerWins() {
		int x = 0;
		gM.paper(x);
		assertEquals("Returns incorrect value for player wins", true, gM.getPlayerWins() == 1);
	}

	// @Test
	// public void testPlayerWinsPercentage() {
	// assertEquals("Returns incorrect value for player wins percentage", x,
	// gM.playerWinsPerc());
	// }
	@Test
	public void testTies() {
		int x = 0;
		gM.rock(x);
		assertEquals("Returns incorrect number of ties", true, gM.getTies() == 1);
	}

/*	@Test
	public void testTiesPercentage() {
		assertEquals("Returns incorrect value for tie percentage", x, gM.ties());
	}

	@Test
	public void testMostCommonlyPicked() {
		assertEquals("Incorreclly displays the most commonly picked move", true, mostCommonlyPicked() == 1);
	}

	@Test
	public void testMostCommonlyPickedPerc() {
		assertEquals("Incorrectly displays the most commonly picked move percentage", true,
				mostCommonlyPickedPerc() == 66);
	}
*/
}
