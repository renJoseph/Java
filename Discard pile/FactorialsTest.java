package Main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialsTest {
	private Factorial fact = new Factorial();
	
	@Test
	public void testReverseFactorial() {
		assertEquals("Returns the incorrect factorial that gives the number input", 5, fact.reverseFactorial(120));
	}
	@Test
	public void testFalseFactorialEntry() {
		assertEquals("Fails to return 'NONE' when an illegitimate factorial value is entered", NONE, fact.reverseFactorial(150));
	}
	@Test
	public void testChallengeTenFactorial() {
		assertEquals("Fails to return 10! for reverse of 3628800", 10, fact.reverseFactorial(3628800));
	}
	@Test
	public void testChallengeTwelveFactorial() {
		assertEquals("Fails to return 12 for reverse factorial ")
	}
}
