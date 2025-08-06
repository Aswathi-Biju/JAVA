package project3;
import java.util.Scanner;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	final static String LIBRARY_NAME = "Central Library" ;
	Book(){
		title="Title not defined";
		author="Author not yet found";
		this.bookID = bookCounter++;
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		this.bookID = bookCounter++;
	}
	public void getInfo() {
		Scanner b = new Scanner(System.in);
		System.out.println("Book's title: " +title);
		title=b.next();
		System.out.println("Book's author: " +author);
		author=b.next();
	}
	public void displayInfo() {
		System.out.println("Book's title: " +title);
		System.out.println("Book's author: " +author);
		System.out.println("Book's ID: " +bookID);
	}
	public void displayInfo(boolean showLibrary) {
		if (showLibrary) {
			displayInfo();
			System.out.println("Library Name: "+LIBRARY_NAME);
		}
	}
	public static void displayTotalBooks() {
		System.out.println("Total books: "+(bookCounter-1000));
	}
}
public class Main {
	public static void main(String []args) {
		Book book1 = new Book();
		book1.displayInfo(true);
		Book.displayTotalBooks();
		Book book2 = new Book();
		book2.getInfo();
		book2.displayInfo(true);
		Book.displayTotalBooks();
		Book book3 = new Book();
		book3.getInfo();
		book3.displayInfo(true);
		Book.displayTotalBooks();
	}
}
