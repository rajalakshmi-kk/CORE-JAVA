package basic;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int n,sum=0,r;
		Scanner nuo = new Scanner(System.in);
		System.out.println("Enter the number");
		n = nuo.nextInt();
		while(n>0) {
			r = n%10;
			sum = sum +r;
			n = n/10;
		}
		System.out.println("Sum of the digit = "+sum);
	}

}
