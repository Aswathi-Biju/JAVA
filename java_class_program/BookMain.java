package project3;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME = "Central Library" ;
	Book(){
		this.bookID = 0;
		title="Title not defined";
		author="Author not yet designed";
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		bookCounter++;
		this.bookID = 0;
	}
	
}
public class Main {

}
