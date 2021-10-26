 import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int sum = 0;
		while(sum<=100) {
			System.out.println("enter the number:");
			sum +=obj.nextInt();
			
			
			
		}
		System.out.println("Done "+" "+sum);
	}

}
