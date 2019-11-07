package main;

public class Compass extends Location {
	public Compass() {
	}

	public void useCompass() {
		int a = this.getMyLocX();
		int b = this.getMyLocY();
		int c = this.getTargLocX();
		int d = this.getTargLocY();
		if ((c - a > 0) && (d - b > 0)) {
			System.out.println("The compass is pointing North-East!");
		} else if ((c - a < 0) && (d - b > 0)) {
			System.out.println("The compass is pointing South-East!");
		} else if ((c - a < 0) && (d - b < 0)) {
			System.out.println("The compass is pointing South-West!");
		} else if ((c - a > 0) && (d - b < 0)) {
			System.out.println("The compass is pointing North-West!");
		} else if ((c - a > 0) && (d - b == 0)) {
			System.out.println("The compass points North!");
		} else if ((c - a < 0) && (d - b == 0)) {
			System.out.println("The compass points South!");
		} else if ((c - a == 0) && (d - b > 0)) {
			System.out.println("The compass points East!");
		} else if ((c - a == 0) && (d - b < 0)) {
			System.out.println("The compass points West!");
		} else {
		}
		float distance = (float) Math.hypot(Math.abs(c - a), Math.abs(d - b));
		System.out.println("You are " + distance + " metres away from the target Location");
	}
}
