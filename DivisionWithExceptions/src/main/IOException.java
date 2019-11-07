package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOException {
	int takeinput() {
		Scanner scan = new Scanner(System.in);
		int input = -1;
		try {
			input = scan.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println(ime.toString());
		} finally {
			scan.close();
		}
		return input;
	}
}
