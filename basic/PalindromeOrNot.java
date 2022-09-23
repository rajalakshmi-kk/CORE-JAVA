package basic;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int n,remainder,reverse=0,temp;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		n = ss.nextInt();
		temp = n;
		while(n>0) {
			remainder = n % 10;
			reverse  = reverse * 10 + remainder;
			n = n/10;
		}
		if(reverse == temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
