package main;

public class Target {
	private double targLocX, targLocY;

	public Target() {
		targLocX = Math.round((Math.random() * 10) - 5);
		targLocY = Math.round((Math.random() * 10) - 5);
	}

	public double getTargLocX() {
		return targLocX;
	}

	public void setTargLocX(double targLocX) {
		this.targLocX = targLocX;
	}

	public double getTargLocY() {
		return targLocY;
	}

	public void setTargLocY(double targLocY) {
		this.targLocY = targLocY;
	}

}
