package main;

public class Plane extends Vehicle {
	private int wingSpan;
	
	public Plane() {
		super();
	}
	
	public Plane(int noOfWheels, int engineSize, int wingSpan) {
		super(noOfWheels, engineSize);
		this.wingSpan = wingSpan;
	}
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	@Override
	public float calcBill() {
		return (17 * wingSpan);
	}
}
