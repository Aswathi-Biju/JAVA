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
	public void getInfo(Scanner b) {
		System.out.println("Enter Book's title: ");
		title=b.nextLine();
		System.out.println("Enter Book's author: ");
		author=b.nextLine();
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
public class BookMain {
	public static void main(String []args) {
		Scanner b = new Scanner(System.in);
		Book book1 = new Book();
		book1.displayInfo(true);
		Book.displayTotalBooks();
		Book book2 = new Book();
		book2.getInfo(b);
		book2.displayInfo(true);
		Book.displayTotalBooks();
		Book book3 = new Book();
		book3.getInfo(b);
		book3.displayInfo(true);
		Book.displayTotalBooks();
	}
}
