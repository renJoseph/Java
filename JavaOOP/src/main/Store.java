package main;

public class Store {
	// Constructor method:
	// The constructor shares its name with the class
	// We create instances by calling or invoking the constructor within the main method
	public Store() {
		// Here we put the instructions for creating a Store instance (a store)
		// We add associated data to an object by introducing instance variables, or instance fields
		// We want Store instances to have a location, so we add:
		String storeLocation;
	}
	public static void main(String[] args) {
		// 1. We call upon the type of class: Store, to access it's methods
		// 2. We give the object a name: fruitStore, so we can refer back to the object
		//    =========================================================================
		// 3. We use: new, to indicate we're creating a new instance
		// 4. We use Store(), to invoke the constructor method defined in class Store
		Store fruitStore = new Store();
	}
}
