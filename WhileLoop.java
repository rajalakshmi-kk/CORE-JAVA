import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner q = new Scanner(System.in);
		System.out.println("Enter the integer");
		int r = q.nextInt();
		while(r>5 || r<20)
		{
			System.out.println(r+ " " + "This integer is not between 5 to 20 !..."+ " " + "Try Again..");
		}
         System.out.println("This integer is between 5 to 20");
	}

}
