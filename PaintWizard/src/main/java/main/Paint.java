package main;

public class Paint {
	private String name;
	private int coverage;
	private double price;
	
	public Paint(){
		super();
	}
	public Paint(String paintName, int coverage, double price) {
		super();
		this.name = paintName;
		this.coverage = coverage;
		this.price = price;
	}
	public String getPaintName() {
		return name;
	}

	public void setPaintName(String paintName) {
		this.name = paintName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	@Override
	public String toString() {
		return "Paint [Name=" + name + ", coverage=" + coverage + ", price=" + price + "]";
	}
}
