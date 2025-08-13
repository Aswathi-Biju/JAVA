package demo;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		//self input
		int[] array= {10,20,30,40,50,60,70,80,90};
		System.out.println("Length of array: "+array.length);
		System.out.println("Displaying the array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.print("\n");
		for(int number:array) {
			System.out.print(number+"\t");
		}
		System.out.print("\n");
		//user input
		String[] text= new String[3];
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the texts");
		for(int i=0; i<text.length;i++) {
			text[i]=t.next();
		}
		System.out.println("The texts are: ");
		for(int i=0; i<text.length;i++) {
			System.out.print(text[i]+"\t");
		}
	}
}
