package main;

public class Dissertation extends Item {
	private int grade;

	public Dissertation(int itemID, boolean available, int grade) {
		super(itemID, available);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
