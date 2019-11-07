package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {
	
	private Library lib = new Library();
	Item book1 = new Book(64827432, true, "Charles Dickens");
	
	@Test
	public void testAddItem() {
		assertEquals("Item was not added correctly", true, lib.addItem(book1));
	}
	@Test
	public void testCheckOutItem() {
		assertEquals("Checking out did not work correctly", false, lib.checkOutItem(book1));
	}
	@Test
	public void testCheckInItem() {
		assertEquals("Checking in did not work correctly", true, lib.checkInItem(book1));
	}
	@Test
	public void testUpdateItemID() {
		assertEquals("Item was updated incorrectly", 85391464, lib.updateItemID(book1, 85391464));
	}
	@Test
	public void testInterfaceSystem() {
		assertEquals("Interface did not correctly catch Exception", "boop", lib.checkOutItem());
	}
	@Test
	public void testRemoveItemByID() {
		assertEquals("Item was not removed correctly", "boop", lib.removeItemByID());
	}
	@Test
	public void testRegisterPerson() {
		assertEquals("Person was registered incorrectly", "boop", lib.registerPerson());
	}
	@Test
	public void testUpdatePerson() {
		assertEquals("Person was updated incorrectly", "boop", lib.updatePerson());
	}
	@Test
	public void testDeletePersonByID() {
		assertEquals("Person was deleted incorrectly", "boop", lib.deletePersonByID());
	}
}
