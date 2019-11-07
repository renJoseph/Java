package Main;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	public List<Person> findByName(String name) {
		return this.people.stream().filter(p -> p.getName().equals(name)).(Collectors.toList());
	}

}