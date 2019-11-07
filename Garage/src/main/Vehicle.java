package main;

public abstract class Vehicle {
	
	private int noOfWheels;
	private int engineSize;
	public Class<?> getClass;
	
	public Vehicle() {
	}
	public Vehicle(int noOfWheels, int engineSize) {
		super();
		this.noOfWheels = noOfWheels;
		this.engineSize = engineSize;
	}
	public abstract float calcBill();
	
	public void makeNoise() {
		System.out.println("Vroom vroom");
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
}
