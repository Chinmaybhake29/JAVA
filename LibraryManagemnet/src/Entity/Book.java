package Entity;

public class Book {

	String title;
	String author;
	String category;
	Boolean availability;
	public Book(String title, String author, String category, Boolean availability) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.availability = availability;
	}
	public Boolean isAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", availability="
				+ availability + "]";
	}
	
}
