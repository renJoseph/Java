package main;

public class ChildObject extends AbstractParent {
	private int objectAttribute;
	
	public ChildObject() {
	super();
	}
	
	public ChildObject(int value, String name, boolean real, int objectAttribute) {
		super(value, name, real);
		this.objectAttribute = objectAttribute;
	}

	public int getObjectAttribute() {
		return objectAttribute;
	}

	public void setObjectAttribute(int objectAttribute) {
		this.objectAttribute = objectAttribute;
	}
	@Override
	public float calculateSomething() {
		return 0;
	}
}
