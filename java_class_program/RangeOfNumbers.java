package project;

import java.util.Scanner;

public class RangeOfNumbers {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first limit:");
		int n = sc.nextInt();
		System.out.println("Enter the second limit:");
		int m = sc.nextInt();
		System.out.println("The nos. upto " +n+ " to " +m+ " are:");
		for (int i=n;i<m+1;i++) {
			System.out.println(+i);
		}
	}
}
