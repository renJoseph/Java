package main;

import java.util.*;

public class Loops {
	public int min(List<Integer> nums) {
		int min = Integer.MAX_VALUE;
		for (int i : nums) {
			min = Math.min(min, i);
		}
		return min;
	}
	public int max(List<Integer> nums) {
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			max = Math.max(max, i);
		}
		return max;
	}
	public List<Integer> odds(List<Integer> nums) {
		List<Integer> odds = new ArrayList<>();
		for (int i : nums) {
			if (i%2 == 1);
		}
		return odds;
	}
	public List<Integer> evens(List<Integer> nums){
		List<Integer> evens = new ArrayList<>();
		for (int i : nums) {
			if (i%2 == 0);
		}
		return evens;
	}
	public int sum(List<Integer> nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}
	public List<Integer> squares(List<Integer> nums){
		List<Integer> sqs = new ArrayList<>();
		for (int i : nums) {
			sqs.add(i * i);
		}
		return sqs;
	}

}
