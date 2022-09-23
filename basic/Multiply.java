package basic;
import java.util.Scanner;
public class Multiply {
static int number;
	public static void Mul() {
//		int number;
		for(int i=1;i<11;i++) {
			System.out.println(number + " * " +i+" = "+(number*i));
		}
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		number = ss.nextInt();
	    Mul();
	}

}
/**
Write a method that prints the multiplication table of the user provided number. Call your method from the main method.
**/