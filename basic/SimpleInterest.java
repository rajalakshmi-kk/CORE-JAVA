package basic;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		double P,N,R,SI;
		Scanner interest = new Scanner(System.in);
		System.out.println("Enter the P,N,R");
		P = interest.nextDouble();
		N = interest.nextDouble();
		R = interest.nextDouble();
		System.out.println("principle = "+P);
		System.out.println("No of Years = "+N);
		System.out.println("Rate of Interest = "+R);
		
		SI = (P*R*N)/100;
		System.out.println("The Simple Interest is : "+SI);
	}

}
