package main;

public class Car extends Vehicle {
	private int bootSize;

	public Car() {
		super();
	}
	public Car(int noOfWheels, int engineSize, int bootSize) {
		super(noOfWheels, engineSize);
		this.bootSize = bootSize;
	}
	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}
	@Override
	public float calcBill() {
		return (5 * bootSize);
	}
}
