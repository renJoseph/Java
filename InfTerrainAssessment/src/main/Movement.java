package main;

import java.util.Scanner;

public class Movement extends Player {
	public Movement() {
	}

	public void move() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the direction to move, 1 = North, 2 = East, 3 = South, 4 = West");
		String a = scan.nextLine();
		int direction = Integer.parseInt(a);
		System.out.println("Please enter how many metres to move.");
		String b = scan.nextLine();
		int distance = Integer.parseInt(b);
		if (direction == 1) {
			setMyLocX(myLocX);
			setMyLocY(myLocY + distance);
			System.out.println("You move " + distance + " metres North!");
		} else if (direction == 2) {
			setMyLocX(myLocX + distance);
			setMyLocY(myLocY);
			System.out.println("You move " + distance + " metres East!");
		} else if (direction == 3) {
			setMyLocX(myLocX);
			setMyLocY(myLocY - distance);
			System.out.println("You move " + distance + " metres South!");
		} else if (direction == 4) {
			setMyLocX(myLocX - distance);
			setMyLocY(myLocY);
			System.out.println("You move " + distance + " metres West!");
		} else {
			System.out.println("AAAAH something went wrong, please try again!");
		}
		scan.close();
	}
}
