package basic;
import java.util.*;
public class ArithmeticExample {
	public static void main(String[] args) {
		int a,b;
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice. Press \n + for Addition \n - for subtraction \n * for multiplication \n / for divison ");
		a = sc.nextInt();
		b = sc.nextInt();
		choice = sc.next().charAt(0);
		
		switch(choice) {
		case '+' : System.out.println("Add = "+(a+b));
		break;
		
		case '-' : System.out.println("Sub = "+(a-b));
		break;
		
		case '*' : System.out.println("Multiply = "+(a*b));
		break;
		
		case '/' : System.out.println("div = "+(a/b));
		break;
		
		default : System.out.println("Invalid");
		}
	}
}
