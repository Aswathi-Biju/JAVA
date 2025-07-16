package project;

import java.util.Scanner;

public class AgeCalculator {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		if(n>=18) {
			System.out.println("You are an adult");	
		}else {
			System.out.println("You are still young");
		}
	}
}
