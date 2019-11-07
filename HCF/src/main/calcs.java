package main;

public class calcs {
	public int hcf(int a, int b) {
		int i = Math.min(a, b);
		while (((a % i) != 0) && ((b % i) != 0)) {
			i--;
		}
		return i;
	}
}
