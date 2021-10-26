import java.util.Scanner;
public class ConditionalOperator {

	public static void main(String[] args) {
		
		
		Scanner x = new Scanner(System.in); 
		System.out.println("Enter the number");
		
		int no=x.nextInt();
		System.out.println(no);
		if(no%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		
	}
}
