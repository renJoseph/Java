package Main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {
	
	private BlackJack jack = new BlackJack();

	@Test
	public void testHighestWins() {
		assertEquals("Highest number did not win", 21, jack.play(16, 21));
	}
	@Test
	public void testOneBust() {
		assertEquals("One was meant to go bust, but didn't", 21, jack.play(21, 22));
	}
}
