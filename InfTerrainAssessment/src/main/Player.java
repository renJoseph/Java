package main;

import java.util.Scanner;

public class Player {
	double myLocX, myLocY;
	Scanner sc;

	public Player() {
		myLocX = Math.round((Math.random() * 10) - 5);
		myLocY = Math.round((Math.random() * 10) - 5);

		sc = new Scanner(System.in);
	}

	public double getMyLocX() {
		return myLocX;
	}

	public void setMyLocX(double myLocX) {
		this.myLocX = myLocX;
	}

	public double getMyLocY() {
		return myLocY;
	}

	public void setMyLocY(double myLocY) {
		this.myLocY = myLocY;
	}

}
