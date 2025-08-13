package demo;
import java.util.Scanner;
public class MultiArray {
	public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=h.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
