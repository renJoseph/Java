package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		char[] arr = new char[3 * input.length()];
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			arr[count] = input.charAt(i);
			count++;
			arr[count] = input.charAt(i);
			count++;
			arr[count] = input.charAt(i);
			count++;
		}
		return new String(arr);
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String a = input.toLowerCase();
		int x = a.indexOf("bert");
		int y = a.lastIndexOf("bert");
		if (x != y) {
			String b = input.substring(x + 4, y);
			return new StringBuilder(b).reverse().toString();
		} else {
			return "";
		}
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int max;
		int mid;
		int min;
		if ((a > b) && (a > c)) {
			max = a;
		} else if ((b > a) && (b > c)) {
			max = b;
		} else {
			max = c;
		}
		if ((a < b) && (a < c)) {
			min = a;
		} else if ((b < c) && (b < a)) {
			min = b;
		} else {
			min = c;
		}
		if ((a != max) && (a != min)) {
			mid = a;
		} else if ((b != max) && (b != min)) {
			mid = b;
		} else {
			mid = c;
		}
		if ((max - mid) == (mid - min)) {
			return true;

		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int index1 = (input.length() - a) / 2;
		int index2 = (input.length() + a) / 2;
		String start = input.substring(0, index1);
		String end = input.substring(index2);
		String s = start.concat(end);
		return s;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if (input.toLowerCase().endsWith("dev")) {
			return true;
		} else {
			return false;
		}
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		List<Character> chars = new ArrayList<>();
		int i;
		if (input.length() > 0) {
			for (i = 0; i < input.length()-1; i++) {
				chars.add(input.charAt(i));
				if (input.charAt(i) != input.charAt(i + 1)) {
					chars.add(',');
				}
			}
			String[] charBlocks = chars.toString().split(",");
			List<Integer> blockLengths = new ArrayList<>();
			for (i = 0; i < charBlocks.length; i++) {
				blockLengths.add(charBlocks[i].length());
			}
			return blockLengths.stream().reduce(Math::max).get();
		} else {
			return 0;
		}
	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int count = 0;
		String[] words = arg1.split(" ");
		int i;
		for (i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase("am")) {
				count++;
			}
		}
		return count;
	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		if ((arg1 % 3 == 0) && (arg1 % 5 != 0)) {
			return "fizz";
		} else if ((arg1 % 3 != 0) && (arg1 % 5 == 0)) {
			return "buzz";
		} else if ((arg1 % 3 == 0) && (arg1 % 5 == 0)) {
			return "fizzbuzz";
		}
		return null;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		List<Integer> ints = new ArrayList<Integer>();
		String[] x = arg1.split(" ");
		int i;
		for (i = 0; i < x.length; i++) {
			ints.add(Stream.of(x[i].split("")).mapToInt(Integer::parseInt).sum());
		}
		return ints.stream().reduce(Math::max).get();
	}
}
