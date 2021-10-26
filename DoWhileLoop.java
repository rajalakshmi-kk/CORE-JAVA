import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.println("Enter the integer");
		int n;
		do {
			System.out.println("Enter the number between 1 and 10");
			n=q.nextInt();
		}while(n<1 || n>10);
		System.out.println("This integer is between 1 to 10");
	}

}
