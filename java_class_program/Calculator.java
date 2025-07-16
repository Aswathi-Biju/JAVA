package project;

import java.util.Scanner;

public class Calculator {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number1: ");
		int n = sc.nextInt();
		System.out.println("Enter a Number2: ");
		int m = sc.nextInt();
		System.out.println("The operations are:");
		System.out.println("1->Sum");
		System.out.println("2->Differnce");
		System.out.println("3->Multiplication");
		System.out.println("4->Division");
		System.out.println("Enter a Operation: ");
		int o = sc.nextInt();
		int result;
		if (o>0 && o<5) {
			switch (o) {
			case 1:
				result=n+m;
				System.out.println("Sum: "+n+"+"+m+"="+result);
				break;
			case 2:
				result=n-m;
				System.out.println("Difference: "+n+"-"+m+"="+result);
				break;
			case 3:
				result=n*m;
				System.out.println("Multiplication: "+n+"*"+m+"="+result);
				break;
			case 4:
				if (m==0) {
					System.out.println("It's not divisble");
				}else {
					result=n/m;
					System.out.println("Division: "+n+"/"+m+"="+result);
					break;
				}
			}
		}
	}
}
