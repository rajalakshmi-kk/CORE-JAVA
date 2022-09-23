package basic;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {

			    int n , firstTerm = 0, secondTerm = 1;
			    Scanner nu = new Scanner(System.in);
				System.out.println("Enter the number");
				n = nu.nextInt();
			    System.out.println("Fibonacci Series till " + n + " terms:");

			    for (int i = 1; i <= n; ++i) {
			      System.out.print(firstTerm + ", ");

			      // compute the next term
			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			    }
			  }
			
	}
