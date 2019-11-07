package main;

public class Book extends Item {
	private String bookName;
	
	public Book(int itemID, boolean available, String author) {
		super(itemID, available);
		this.bookName = author;
	}

	public String getAuthor() {
		return bookName;
	}

	public void setAuthor(String author) {
		this.bookName = author;
	}
}
