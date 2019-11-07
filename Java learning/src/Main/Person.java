package Main;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public Person() {
	}
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void getAge(int a) {
		this.age = a;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void getJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
/*package Main;

import java.util.*;

public class Javalearning {
	
	public static String search = "Dave";

	public static void main(String[] args) {

		Person person1 = new Person("Dave", 20, "Builder");
		Person person2 = new Person("Anna", 863, "Vampire");
		
		List<Person> people = new ArrayList<>();
		people.add(person1);
		people.add(person2);
		
		for (Person p : people) {
			System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Job: " + p.getJobTitle());
		}
		for (Person p : people) {
			if (search == p.getName()) {
			System.out.println("We found a " + search + "!");
			break;
			} else {
			System.out.println(search + " is not in the list!");
			}
		}

	}
}
*/