package demo;
import java.util.Scanner;
public class CopyElements {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter rows and cols:");
		int r =x.nextInt();
		int c= x.nextInt();
		int[][] matrix = new int[r][c];
		int[][] copy_m = new int[r][c];
		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=x.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("The Copied matrix is: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				copy_m[i][j]=matrix[i][j];
			}
		}
		for(int i=0; i<copy_m.length;i++) {
			for(int j=0;j<copy_m[i].length;j++) {
				System.out.print(copy_m[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		int[] array = new int[r];
		int[] copy_a = new int[r];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<array.length;i++) {
				array[i]=x.nextInt();
		}
		System.out.println("The array is: ");
		for(int i=0; i<array.length;i++) {
				System.out.print(array[i]+"\t");
		}
		System.out.print("\n");
		System.out.println("The Copied array is: ");
		for(int i=0; i<array.length;i++) {
				copy_a[i]=array[i];
		}
		for(int i=0; i<copy_a.length;i++) {
				System.out.print(copy_a[i]+"\t");
		}
		
	}
}
