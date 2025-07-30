package project;

import java.util.Scanner;

class Book{
	String title;
	String author;
	double price;
	int quantity;
	double totalValue;
	Book(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price  =price;
		this.quantity = quantity;
	}
	public void calculate() {
		totalValue = price * quantity;
	}
	public void displayDetails() {
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("Price: "+this.price);
		System.out.println("Quantity: "+this.quantity);
		System.out.println("Total Value: "+totalValue);
	}
}
public class BookStore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of Book1: ");
		System.out.println("Title: ");
		String t1=sc.next();
		System.out.println("Author: ");
		String a1=sc.next();
		System.out.println("Price: ");
		int p1=sc.nextInt();
		System.out.println("Quantity: ");
		int q1=sc.nextInt();
		
		System.out.println("Enter the details of Book2: ");
		System.out.println("Title: ");
		String t2=sc.next();
		System.out.println("Author: ");
		String a2=sc.next();
		System.out.println("Price: ");
		int p2=sc.nextInt();
		System.out.println("Quantity: ");
		int q2=sc.nextInt();
		
		System.out.println("Display the details of book1: ");
		Book b1=new Book(t1,a1,p1,q1);
		b1.calculate();
		b1.displayDetails();

		System.out.println("Display the details of book2: ");
		Book b2=new Book(t2,a2,p2,q2);
		b2.calculate();
		b2.displayDetails();
		
	}
}
