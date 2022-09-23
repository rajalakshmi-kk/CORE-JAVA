package basic;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		double purchase,discount,costToPaid;
		Scanner rs = new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		purchase = rs.nextDouble();
		
		if(purchase == 10000) {
		    discount = (purchase*10)/100;
	        costToPaid = purchase - discount;
	        System.out.println("Amount after discount");
		}
		else {
			System.out.println("No discount !");
		}
	}

}
