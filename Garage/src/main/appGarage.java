package main;

public class appGarage {

	public static void main(String[] args) {
		Garage g = new Garage();
		g.addVehicle(new Car(1, 2, 4));
		g.addVehicle(new Plane(6 ,3, 7));
		g.addVehicle(new Boat(9, 4, 4));
		g.printVehicles();
		g.calcBill();
	}
}
