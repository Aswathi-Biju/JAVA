package demo;

import java.util.Scanner;

class Student{
	String name;
	int rollNumber;
	int mark1;
	int mark2;
	int mark3;
	int total;
	float average;
	Student(String name,int rollNumber, int mark1, int mark2, int mark3){
		this.name=name;
		this.rollNumber=rollNumber;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void calculateAverage(){
		total = mark1+mark2+mark3;
		average = total/3; 
	}
	public void displayDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Roll Number: "+this.rollNumber);
		System.out.println("Marks obtained in subject1: "+this.mark1);
		System.out.println("Marks obtained in subject2: "+this.mark2);
		System.out.println("Marks obtained in subject3: "+this.mark3);
		System.out.println("Average Marks: "+average); 
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of Student1: ");
		System.out.println("Name: ");
		String name1=sc.next();
		System.out.println("Roll Number: ");
		int rollNumber1=sc.nextInt();
		System.out.println("Mark1: ");
		int m1=sc.nextInt();
		System.out.println("Mark2: ");
		int m2=sc.nextInt();
		System.out.println("Mark3: ");
		int m3=sc.nextInt();
		
		System.out.println("Enter the details of Student2: ");
		System.out.print("Name: ");
		String name2=sc.next();
		System.out.println("Roll Number: ");
		int rollNumber2=sc.nextInt();
		System.out.println("Mark1: ");
		int m4=sc.nextInt();
		System.out.println("Mark2: ");
		int m5=sc.nextInt();
		System.out.println("Mark3: ");
		int m6=sc.nextInt();
		
		System.out.println("Display the details of student1: ");
		Student s1=new Student(name1,rollNumber1,m1,m2,m3);
		s1.calculateAverage();
		s1.displayDetails();
		
		System.out.println("Display the details of student2: ");
		Student s2=new Student(name2,rollNumber2,m4,m5,m6);
		s2.calculateAverage();
		s2.displayDetails();
		
	}
}
