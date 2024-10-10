package Camposition;
import java.io.*;
import java.util.*;

class Book
{
	public String title;
	public String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
}
class Library{
	private final List<Book> books;
	
	public Library(List<Book> books) {
		this.books=books;
	}
	public List<Book> getTotalBooksInLibrary(){
		return books;
	}
}
public class Compositiondemo 
{
	public static void main(String args[]) {
		Book b1=new Book("Head of java", "Kathy Ciera");
		Book b2=new Book("Thinking in java", "Bruce Eckel");
		Book b3=new Book("The Complete Refernce", "Herbert Schildt");
		Book b4=new Book("PHP", "Resmus Lenforf");
		
		
		List<Book> books=new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		Library l=new Library(books);
		List<Book> b=l.getTotalBooksInLibrary();
		for (Book book : b) {
			System.out.println("Title : " + book.title + " and " + book.author);
		}
		
		
	}
}
