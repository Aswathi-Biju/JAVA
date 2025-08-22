import java.util.Scanner;

public class Day {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Day(1 to 7): ");
		int day = sc.nextInt();
		String result=switch(day) {
		case 1 ->"Monday";
		case 2 ->"Tuesday";
		case 3 ->"Wednesday";
		case 4 ->"Thursday";
		case 5 ->"Friday";
		case 6 ->"Saturday";
		case 7 ->"Sunday";
		default ->"Invalid day number";
		};
		System.out.println("The day is "+result);
	}
}
