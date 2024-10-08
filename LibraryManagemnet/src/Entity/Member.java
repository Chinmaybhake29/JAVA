package Entity;

import java.util.ArrayList;

public class Member {

	String name;
	String memberId;
	static long id = 1000;

	ArrayList<Book> borrowedBook;

	public Member(String name) {
		super();
		this.name = name;
		this.memberId = "LIB" + ++id;

		borrowedBook = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public ArrayList<Book> getBorrowedBook() {
		return borrowedBook;
	}

	public void borrowBook(Book book) {
		if (book.isAvailability()) {
			borrowedBook.add(book);
			book.setAvailability(false);
			System.out.println(this.name + " borrowed book " + book.getTitle());
		} else {
			System.out.println("This book is not availabel");
		}
	}

	public void removeBook(Book book) {
		if (borrowedBook.contains(book)) {
			borrowedBook.remove(book);
			book.setAvailability(true);
			System.out.println(this.name + " Returned book " + book.getTitle());
		} else {
			System.out.println("This book is not availabel");
		}
	}

}
