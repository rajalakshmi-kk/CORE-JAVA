package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufSimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double P,N,R,SI;
		BufferedReader interest = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the P,N,R");
		P = Double.parseDouble(interest.readLine());
		N = Double.parseDouble(interest.readLine());
		R = Double.parseDouble(interest.readLine());
		System.out.println("principle = "+P);
		System.out.println("No of Years = "+N);
		System.out.println("Rate of Interest = "+R);
		
		SI = (P*R*N)/100;
		System.out.println("The Simple Interest is : "+SI);

	}

}
