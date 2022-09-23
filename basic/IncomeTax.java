package basic;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		double salary,tax;
		Scanner rs = new Scanner(System.in);
		System.out.println("Enter the salary");
		salary = rs.nextDouble();
		
		if(salary<25000) {
			tax = salary*0.10;
			System.out.println("Tax amount = "+tax);
			}
		else {
			tax = salary*0.15;
			System.out.println("Tax amount = "+tax);
		}
		}
	}
	


