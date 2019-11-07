package Main;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public double divide(double a, double b) {
		if(b<a){
			return a / b;
		}
		else {
			System.out.println("You can't do that, young lady.");
			return 0;
		}
	}
	
}
