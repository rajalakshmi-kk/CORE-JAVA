package basic;

import java.util.Scanner;
public class ArmstrongOrNot {

	public static void main(String[] args) {
		int n,r,temp,sum=0;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		n = ss.nextInt();		
		temp = n;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum + r*r*r;
		}
		if(temp == sum) {
			System.out.println("The number "+ sum+" is a armstrong number");
		}
		else {
			System.out.println(sum +" Not a armstrong number");
		}
	}

}
