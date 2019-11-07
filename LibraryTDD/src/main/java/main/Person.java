package main;

public class Person {
	private int personID;
	private int itemsWithdrawn;
	
	public Person(int uniqueID, int itemsWithdrawn) {
		this.personID = uniqueID;
		this.itemsWithdrawn = itemsWithdrawn;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int uniqueID) {
		this.personID = uniqueID;
	}
	public int getItemsWithdrawn() {
		return itemsWithdrawn;
	}
	public void setItemsWithdrawn(int itemsWithdrawn) {
		this.itemsWithdrawn = itemsWithdrawn;
	} 
}