package basic;

import java.util.Scanner;
public class Calls {

	public static void main(String[] args) {
		int call,bill;
		Scanner cl = new Scanner(System.in);
		System.out.println("Enter the number of calls");
		call = cl.nextInt();
		
		if(call<200) {
			bill = call * 1;
			System.out.println("The bill amount = "+bill);
		}
		else if(call>=200) {
			bill = call * 3;
			System.out.println("The bill amount = "+bill);
		}
		else {
			System.out.println("null");
		}
	}

}
