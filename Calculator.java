import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the First Number operator Second Number :");
		
		Scanner y = new Scanner(System.in);
		double numb1 = y.nextDouble();
		char operator = y.next().charAt(0);
		double numb2 = y.nextDouble();	
	   
		if(operator == '+')
			System.out.println((int)(numb1 + numb2));
		else if(operator == '-')
			System.out.println((int)(numb1 - numb2));
		else if(operator == '*')
			System.out.println((int)(numb1 * numb2));
		else if(operator == '/')
			System.out.println((int)(numb1 / numb2));
		else if(operator == '%')
			System.out.println((int)(numb1 % numb2));
			
		else
			System.out.println("Invalid");
	}

}
