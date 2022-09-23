package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buftriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double b,h,area;
		
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius");
		b = Double.parseDouble(bb.readLine());
		System.out.println("Enter the height");
        h = Double.parseDouble(bb.readLine());
        area = 0.5*b*h;
        System.out.println("the area of the triangle is :"+area);
		
	}

	

}
