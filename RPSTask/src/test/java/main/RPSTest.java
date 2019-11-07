package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPSTest {
	GameManager gM = new GameManager();

	@Test
	public void testTotalGamesPlayed() {
		assertEquals("Returns incorrect value for total games played", x, gM.totalGamesPlayed());
	}
	@Test
	public void testComputerWins() {
		assertEquals("Returns incorrect value for computer wins", x, gM.computerWins());
	}
	@Test
	public void testComputerWinsPercentage() {
		assertEquals("Returns incorrect value for computer win percentage", x, gM.computerWinPerc());
	}
	@Test
	public void testPlayerWins() {
		assertEquals("Returns incorrect value for player wins", x, gM.playerWins());
	}
	@Test
	public void testPlayerWinsPercentage() {
		assertEquals("Returns incorrect value for player wins percentage", x, gM.playerWinsPerc());
	}
	@Test
	public void testTies() {
		assertEquals("Returns incorrect number of ties", x, gM.ties());
	}
	@Test
	public void testTiesPercentage() {
		assertEquals("Returns incorrect value for tie percentage", x, gM.ties());
	}
	@Test
	public void testMostCommonlyPicked() {
		assertEquals("Incorreclly displays the most commonly picked move", true, mostCommonlyPicked() == 1);
	}
	@Test
	public void testMostCommonlyPickedPerc() {
		assertEquals("Incorrectly displays the most commonly picked move percentage", true, mostCommonlyPickedPerc() == 66);
	}
}
