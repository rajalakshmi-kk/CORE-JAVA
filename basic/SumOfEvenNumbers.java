package basic;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
     int n,i,m,sum = 0;
     Scanner no = new Scanner(System.in);
     System.out.println("Enter the value of m");
     m = no.nextInt();
     System.out.println("Enter the value of n");
     n = no.nextInt();
     for(i=m;i<=n;i++) {
    	 if(i%2 == 0) {
    		 sum = sum + i;
    	 }
     }
     System.out.println("Sum of even numbers between "+m+ " and "+n+ " = "+sum);
	}

}
