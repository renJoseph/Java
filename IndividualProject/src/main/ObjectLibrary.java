package main;

import java.util.ArrayList;
import java.util.List;

public class ObjectLibrary {

private List<AbstractParent> objects = new ArrayList<>();
	
	public ObjectLibrary() {
		super();
	}
	public void printObjects() {
		for (AbstractParent i : objects) {
			System.out.println(i);
		}
	}
//	public float calculateSomething() {
//		float result = 0f;
//		for (i : objects) {
//			result += i.calculateSomething();
//		}
//		return result;			
//	}
	public boolean addObject (AbstractParent object) {
		return this.objects.add(object);
	}
	public boolean removeVObject (AbstractParent object) {
		return this.objects.remove(object);
	}
	public void removeObjectByType(Class<?> clazz) {
		List<AbstractParent> toRemove = new ArrayList<>();
		for (AbstractParent v : objects) {
			if (v.getClass == clazz) {
				toRemove.add(v);
			}
		}
		objects.removeAll(toRemove);
	}
	public boolean emptyObjectLibrary() {
		this.objects.clear();
		return this.objects.size() == 0;
	}
	
}
