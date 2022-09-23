package basic;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int n,remainder,reverse=0;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		n = ss.nextInt();
		while(n>0) {
			remainder = n % 10;
			reverse  = reverse * 10 + remainder;
			n = n/10;
		}
		System.out.println("The reverse of "+n+ " is "+reverse);
	}

}
