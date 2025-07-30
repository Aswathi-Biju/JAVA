package project;
import java.util.Scanner;
class PaymentGateway{
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Payment Mode: Credit Card");
		
	}
	public void makePayment(String upild) {
		System.out.println("Payment Mode: UPI");
	}
	public void makePaymet(double amount) {
		System.out.println("Payment Mode: Cash on delivery");
	}
}
public class ECommerceApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PaymentGateway pt = new PaymentGateway();
		System.out.print("How would you like to do the payment?(Press 1-card, 2-UPI, 3-Cash):");
		
		int n = s.nextInt();
		switch(n) {
		case 1: pt.makePayment("7632 76587","dd/mm/yyyy", "376284");
			System.out.println("Processing Payment....");
			System.out.println("Payment Succesful via Card");
			break;
		case 2: pt.makePayment("809437652"); 
			System.out.println("Processing Payment....");
			System.out.println("Payment Succesful via UPID");
			break;
		case 3: pt.makePaymet(840);
			System.out.println("Processing Payment....");
			System.out.println("Payment Succesful via Cash");
			break;
		default: System.out.println("Invalid payment"); break;
		}
	}
}
