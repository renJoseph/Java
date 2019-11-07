package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	
	private List<Vehicle> vehicles = new ArrayList<>();
	
	public Garage() {
		super();
	}
	public void printVehicles() {
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
	public float calcBill() {
		float bill = 0f;
		for (Vehicle v : vehicles) {
			bill += v.calcBill();
		}
		return bill;			
	}
	public boolean addVehicle (Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}
	public boolean removeVehicle (Vehicle vehicle) {
		return this.vehicles.remove(vehicle);
	}
	public void removeVehicleByType(Class<?> clazz) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : vehicles) {
			if (v.getClass == clazz) {
				toRemove.add(v);
			}
		}
		vehicles.removeAll(toRemove);
	}
	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}
	
}
