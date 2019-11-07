package main;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
//min
	public int min(List<Integer> nums) {
		return nums.stream().reduce(Math::min).get();
	}
	public int max(List<Integer> nums) {
		return nums.stream().reduce(Math::max).get();
	}
	public List<Integer> odds(List<Integer> nums){
		return nums.stream().filter(x -> x%2 != 0).collect(Collectors.toList());
	}
	public List<Integer> evens(List<Integer> nums){
		return nums.parallelStream().filter(x-> x%2 == 0).collect(Collectors.toList());
	}
	public int sum(List<Integer> nums) {
		return nums.stream().reduce((a, b) -> a + b).get();
	}
	public int squareOddMin(List<Integer> nums) {
		return nums.stream().map(x-> x * x).filter(x-> x%2 != 0).reduce(Math::min).get();
	}
//max
//odds
//evens
//sum
//squares
}
