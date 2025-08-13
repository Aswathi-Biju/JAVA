package demo;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter rows and cols:");
		int r =m.nextInt();
		int c= m.nextInt();
		int[][] matrix = new int[r][c];
		int[][] transpose = new int[c][r];
		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=m.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("The Transpose matrix is: ");
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		for(int i=0; i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
