package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufMarks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double Mat,Phy,Chem,percentage;
		BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Maths mark");
		Mat = Double.parseDouble(m.readLine());
		System.out.println("Maths = "+Mat);
		System.out.println("Enter the Physics mark");
		Phy = Double.parseDouble(m.readLine());
		System.out.println("Physics = "+Phy);
		System.out.println("Enter the Chemistry mark");
		Chem = Double.parseDouble(m.readLine());
	    System.out.println("Chemistry = "+Chem);
	    
	    percentage = ((Mat+Phy+Chem)/300) * 100;
	    System.out.println("The final percentage is : "+percentage);

	}

}
