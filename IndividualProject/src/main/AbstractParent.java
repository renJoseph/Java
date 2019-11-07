package main;

public abstract class AbstractParent {
	private int value;
	private String name;
	private boolean real;
	public Class<?> getClass;
	
	public AbstractParent() {
	}
	public AbstractParent(int value, String name, boolean real){
		super();
		this.value = value;
		this.name = name;
		this.real = real;
	}
	public abstract float calculateSomething();
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isReal() {
		return real;
	}
	public void setReal(boolean real) {
		this.real = real;
	}
}