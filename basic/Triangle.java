package basic;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		double b,h,area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base and height ");
		b = s.nextDouble();
		h = s.nextDouble();
		System.out.println("base = "+b);
		System.out.println("Height = "+h);
		
		area = 0.5*b*h;
		System.out.println("Area of the Triangle :"+area);
	}

}
