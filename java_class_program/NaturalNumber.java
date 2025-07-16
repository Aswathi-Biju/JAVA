package project;

import java.util.Scanner;
public class NaturalNumber {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		System.out.println("The natural nos. upto " +n+ "are:");
		for (int i=1; i<=n; i++) {
			System.out.println(+i);
		}
	}
}
