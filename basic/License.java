package basic;

import java.util.Scanner;
public class License {

	public static void main(String[] args) {
		int age;
		Scanner ag = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = ag.nextInt();
		
		if(age>18) {
			System.out.println("This Candidate is eligible for License");
		}
		else {
			System.out.println("This Candidate is not eligible for License");
		}
	}

}
