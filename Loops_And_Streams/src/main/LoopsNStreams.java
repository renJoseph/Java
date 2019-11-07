package main;

import java.util.*;

public class LoopsNStreams {
	
	public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	Loops loops = new Loops();
	Streams streams = new Streams();
	
	System.out.println("Max: " + streams.max(nums));
	System.out.println("Min: " + streams.min(nums));
	System.out.println("Evens: " + streams.evens(nums));
	System.out.println("Odds: " + streams.odds(nums));
	System.out.println("Square-even-min: " + streams.squareOddMin(nums));
	}
}
