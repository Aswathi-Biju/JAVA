package demo;
import java.util.Scanner;
public class AddMatrix {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter rows and cols:");
		int r =f.nextInt();
		int c= f.nextInt();
		int[][] matrix1 = new int[r][c];
		int[][] matrix2 = new int[r][c];
		int[][] result = new int[r][c];
		System.out.println("Enter the matrix_1 elements: ");
		for(int i=0; i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				matrix1[i][j]=f.nextInt();
			}
		}
		System.out.println("Enter the matrix_2 elements: ");
		for(int i=0; i<matrix2.length;i++) {
			for(int j=0;j<matrix2[i].length;j++) {
				matrix2[i][j]=f.nextInt();
			}
		}
		//result add calculating
		for(int i=0; i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}

		System.out.println("The matrix_1 is: ");
		for(int i=0; i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("The matrix_2 is: ");
		for(int i=0; i<matrix2.length;i++) {
			for(int j=0;j<matrix2[i].length;j++) {
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("The Result elements are: ");
		for(int i=0; i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}
}
