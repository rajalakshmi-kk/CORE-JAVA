package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufCircle {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		double r,area;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius :");
        
        r = Double.parseDouble(b.readLine());      
        area = 3.14 * r * r;
        System.out.println("Area of the circle is : "+area);
	}



}
