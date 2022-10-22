package string;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String a,b="";
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the word");
		a = ss.next();
		int n = a.length();
		for(int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
		System.out.println(b);
	}

}
