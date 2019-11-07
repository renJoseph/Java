package main;

public abstract class Item {
	private int itemID;
	private boolean availability;

	public Item(int itemID, boolean available) {
		this.itemID = itemID;
		this.availability = available;
	}
	public boolean isAvailable() {
		return availability;
	}
	public void setAvailable(boolean available) {
		this.availability = available;
	}
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	@Override
	public String toString() {
		return "Item [Unique ID = " + itemID + ", Availability = " + availability + "]";
	}
}
