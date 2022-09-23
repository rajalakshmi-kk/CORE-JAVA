package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = ss.nextInt();
		for(i=1;i<=n;i++) {
			fact = fact*i;
			
		}
		System.out.println("The factorial of "+n+ " is " +fact);
	}

}
