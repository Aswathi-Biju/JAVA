package project;
import java.util.Scanner;
class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Salary: "+this.salary);
	}
}
public class EmployeeDemo {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Employee1:");
		String name1=sc.next();
		System.out.println("Enter the Id of the Employee1:");
		int id1=sc.nextInt();
		System.out.println("Enter the Salary of the Employee1:");
		float salary1=sc.nextFloat();
		
		System.out.println("Enter the Name of the Employee2:");
		String name2=sc.next();
		System.out.println("Enter the Id of the Employee2:");
		int id2=sc.nextInt();
		System.out.println("Enter the Salary of the Employee2:");
		float salary2=sc.nextFloat();
		
		System.out.println("Details of Employee1: ");
		Employee e1=new Employee(name1,id1, salary1);
		e1.displayDetails();
		
		System.out.println("Details of Employee2: ");
		Employee e2=new Employee(name2,id2, salary2);
		e2.displayDetails();
	}
}
