package Service;

import java.util.HashMap;
import Entity.*;
public class Library 
{
		HashMap<String, Book> books;
		HashMap<String, Member> members;
		
		public Library() {
			books=new HashMap<String, Book>();
			members=new HashMap<String, Member>();
		}
		public void addBook(Book book) {
			books.put(book.getTitle(), book);
			System.out.println("Book added Successfully");
		}
		public void removeBook(String title) {
			books.remove(title);
			System.out.println("Book removed Successfully");
		}
		public Book searchBook(String title) {
			return books.remove(title);
		}
		
}
