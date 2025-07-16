package project;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println(+n+" is positive");
		}else if(n==0){
			System.out.println("It's Zero");
			
		}else {
			System.out.println(+n+" is negative");
		}
	}
}
