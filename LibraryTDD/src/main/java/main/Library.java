package main;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Person> people = new ArrayList<>();
	private List<Item> items = new ArrayList<>();
	
	public Library() {
	}
	public boolean checkInItem(Item item) {
		item.setAvailable(true);
		return item.isAvailable();
	}
	public boolean checkOutItem (Item item) {
		item.setAvailable(false);
		return item.isAvailable();
	}
	public boolean addItem(Item item) {
		this.items.add(item);
		return items.contains(item);
	}
	public boolean removeItemByID(int itemID) {
        List<Item> toRemoveItem = new ArrayList<Item>();
        for (Item i : items) {
            if (i.getItemID() == itemID) {
                toRemoveItem.add(i);
            }
        }
        items.removeAll(toRemoveItem);
        return items.getItemID.contains(itemID);
    }
	public int updateItemID(Item item, int x) {
		item.setItemID(x);
		return item.getItemID();
	}

	public boolean registerPerson(Person person) {
		return this.people.add(person);
	}	
	public boolean deletePersonByID(int personID) {
        List<Person> toRemovePerson = new ArrayList<Person>();
        for (Person p : people) {
            if (p.getPersonID() == personID) {
                toRemovePerson.add(p);
            }
        }
        people.removeAll(toRemovePerson);
        return people.contains(personID);
    }
	public int updatePerson(Person person, int x) {
		person.setItemsWithdrawn(x);
		return person.getItemsWithdrawn();
	}

}
