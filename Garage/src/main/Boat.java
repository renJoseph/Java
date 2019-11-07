package main;

public class Boat extends Vehicle {
	private int waterCoverage;
	
	public Boat() {
		super();
	}
	public Boat(int noOfWheels, int engineSize, int waterCoverage) {
		super(noOfWheels, engineSize);
		this.waterCoverage = waterCoverage;
	}
	public int getWaterCoverage() {
		return waterCoverage;
	}
	public void setWaterCoverage(int waterCoverage) {
		this.waterCoverage = waterCoverage;
	}
	@Override
	public float calcBill() {
		return (waterCoverage * waterCoverage);
	}
}
