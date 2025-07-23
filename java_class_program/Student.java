package project;

class Students{
	String name;
	int age;
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class Student {
	public static void main(String []args) {
		Students stud = new Students();
		stud.name = "Aswathi";
		stud.age = 19;
		stud.displayDetails();
	}

}
