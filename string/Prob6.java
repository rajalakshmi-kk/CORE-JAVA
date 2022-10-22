package string;
import java.util.Scanner;
public class Prob6 {
/*
 * QUESTION : Check whether a string is a palindrome or not
 */
	public static void main(String[] args) {
		String sen="past is PAST";
		String sen2 = "";
		System.out.println("Sentence before reversing : "+sen);
//    	System.out.println("Enter the name");
//		Scanner scan = new Scanner(System.in);
//		sen = scan.nextLine();
//		System.out.print(sen);
//		System.out.println("\n");
		String ar[] = sen.split(" ");
		
		System.out.print("\n");
		
		for(int i=ar.length-1; i>=0; i--) {
			sen2 = sen2 + ar[i] +" ";
		}
		System.out.println(sen2);
		System.out.println(sen);
		sen=sen.trim();
		sen2=sen2.trim();
		
		if( sen2.equalsIgnoreCase(sen)) {
			System.out.println("\nThe sentence is Palindrome");
		}
		else {
			System.out.println("\nThe sentence is not a Palindrome");
		}
	}

}
