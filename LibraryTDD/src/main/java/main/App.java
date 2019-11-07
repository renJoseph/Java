package main;

public class App {
	public static void main(String[] args) {
		Database database = new ProxyDatabase();
		try {
			database.processRequest(12345678);
			database.processRequest(27847462);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	Library lib = new Library();
	
}
