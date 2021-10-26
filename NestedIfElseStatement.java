	import java.util.Scanner;
public class NestedIfElseStatement {

	

		public static void main(String[] args) {
			
			
			Scanner x = new Scanner(System.in); 
			System.out.println("Enter the number");
			
			int no=x.nextInt();
			System.out.println(no);
			if(no>10)
				System.out.println("The number is Greater than 10");
			else if(no<10)
				System.out.println("The number is Less than 10");
				
			else
				System.out.println("None");
			
		}
	}
