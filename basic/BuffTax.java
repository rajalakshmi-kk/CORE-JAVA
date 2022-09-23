package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class BuffTax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double tax,salary;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter salary ");
		salary = Double.parseDouble(sc.readLine());
		tax = salary*0.12;
		System.out.println("Tax amount = "+tax);
	}

	

}
