package basic;

import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		int num;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		num = ss.nextInt();
		
		switch(num%2) {
		
		case 0:
			System.out.println("The number is even");
		break;
		
		case 1:
			System.out.println("The number is odd");
		break;
		
		}
	}

}
