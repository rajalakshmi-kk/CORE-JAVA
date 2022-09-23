package basic;

import java.util.Scanner;

public class Prob5 {
	static int prod=1, num;
	public static void divisibleByThreeFive() {
		while(num != 0) {
			int r = num % 10;
			prod = prod * r;
			num /= 10;
		}
		if(prod % 3 == 0 || prod % 5 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = ss.nextInt();
		if(num <= 0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
			divisibleByThreeFive();
			
		}
	}

}

/**
Q.
Write a program to find whether the given number is a 3/5 Number.
 
A number is a 3/5 Number if the product of the digits in the number is divisible by 3 or 5.
 
Include a function named divisibleByThreeFive that accepts an integer argument and returns an integer. The function returns
1.	1 if it is a 3/5 Number
2.	0 if it is not a 3/5 Number
3.	-1 if it is a negative number
 
Input and Output Format:
Input consists of a single integer.
Output consists of a string.
Refer sample output for formatting specifications.
 
Sample Input 1:
251
 
Sample Output 1:
yes
 
Sample Input 2:
241
 
Sample Output 2:
no
 
Sample Input 3:
-9
 
Sample Output 3:
Invalid Input

**/