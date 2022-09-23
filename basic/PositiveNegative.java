package basic;
import java.util.*;
public class PositiveNegative {

	public static void main(String[] args) {
		int num1,num2;
		Scanner no = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = no.nextInt();
		
		if(num1>0) {
			System.out.println("num1 is positive");
		}
		else if(num1<0) {
			System.out.println("num1 is negative");
		}
		else {
			System.out.println("num1 is zero");
		}
		
		System.out.println("Enter num2");
		num2 = no.nextInt();
		if(num2>0) {
			System.out.println("num2 is positive");
		}
		else if(num2<0) {
			System.out.println("num2 is negative");
		}
		else {
			System.out.println("num2 is zero");
		}
		
		}

}
