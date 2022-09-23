package basic;
import java.util.*;
public class MarksPercentage {

	public static void main(String[] args) {
		double Mat,Phy,Chem,percentage;
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the Maths mark");
		Mat = m.nextDouble();
		System.out.println("Maths = "+Mat);
		System.out.println("Enter the Physics mark");
		Phy = m.nextDouble();
		System.out.println("Physics = "+Phy);
		System.out.println("Enter the Chemistry mark");
		Chem = m.nextDouble();
	    System.out.println("Chemistry = "+Chem);
	    
	    percentage = (Mat+Phy+Chem/300) / 100;
	    System.out.println("The final percentage is : "+percentage);
	}

}
