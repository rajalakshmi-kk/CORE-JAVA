package basic;
import java.util.Scanner;
public class ShapeSwitch {

	public static void main(String[] args) {
		double r,l,w,b,h;
		String shape;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter your shape. enter cir or rect or tri");
		shape = ss.next();

		
		switch(shape) {
		case "cir" : 
			System.out.println("Enter the radius");
			r = ss.nextDouble();
			System.out.println("Area of Circle = "+ (3.14*r*r));
		break;
		
		case "rect" :
			System.out.println("Enter the length and width");
		    l = ss.nextDouble();
		    w = ss.nextDouble();
		    System.out.println("Area of the Rectangle = "+(l*w));
	     break;
	     
		case "tri" :
			System.out.println("Enter the base and height");
			b = ss.nextDouble();
			h = ss.nextDouble();
			System.out.println("Area of the triangle = "+(0.5 * b * h));
	    break;
	    
	    default : System.out.println("Invalid choice");
		}
	}

}
