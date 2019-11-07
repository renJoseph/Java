package main;

public class Location {
	private int[] myLoc;
	private int[] targLoc;
	
	public Location() {
	}
	
	public Location(int myX, int myY, int targX, int targY) {
		this.myLoc[0] = myX;
		this.myLoc[1] = myY;
		this.targLoc[0] = targX;
		this.targLoc[1] = targY;
	}
	
	public int getMyLocX() {
		return myLoc[0];
	}

	public void setMyLocX(int myLocX) {
		this.myLoc[0] = myLocX;
	}

	public int getMyLocY() {
		return myLoc[1];
	}

	public void setMyLocY(int myLocY) {
		this.myLoc[1] = myLocY;
	}

	public int getTargLocX() {
		return targLoc[0];
	}

	public void setTargLocX(int targLocX) {
		this.targLoc[0] = targLocX;
	}

	public int getTargLocY() {
		return targLoc[1];
	}

	public void setTargLocY(int targLocY) {
		this.targLoc[1] = targLocY;
	}

	public int[] getTargLoc() {
		return targLoc;
	}

	public void setTargLoc(int targX, int targY) {
		this.targLoc[0] = targX;
		this.targLoc[1] = targY;
	}
	
	public int[] getMyLoc() {
		return myLoc;
	}

	public void setMyLoc(int myX, int myY) {
		this.myLoc[0] = myX;
		this.myLoc[1] = myY;
	}
}