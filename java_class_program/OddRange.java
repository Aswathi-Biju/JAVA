package project;

public class OddRange {
	public static void main(String []args) {
		int n1=1;
		int n2=50;
		for(int i=n1;i<n2 + 1; i++) {
			if(i%2==0) {
				continue;
			}else {
				System.out.println(+i);
			}
		}
	}
}
