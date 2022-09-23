package basic;
import java.util.Scanner;
public class Prob3 {
	static int num,count=0;
	public static void countDigit() {
		while (num != 0) {
		      num = num/10;
		      count++;
		    }
		System.out.println("Number of digits in a given number : "+count);
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		num = ss.nextInt();
		if(num<0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else {
			countDigit();
		}
		
	}

}
