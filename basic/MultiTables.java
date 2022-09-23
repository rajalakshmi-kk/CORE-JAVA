package basic;

import java.util.Scanner;

public class MultiTables {

	public static void main(String[] args) {
		int i,n,result;
		Scanner nu = new Scanner(System.in);
		System.out.println("Enter the number");
		n = nu.nextInt();
		for(i=1;i<=10;i++) {
			result = n*i;
			System.out.println(result);
		}

	}

}
