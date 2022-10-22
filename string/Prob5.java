package string;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		String sen;
		System.out.println("Enter the name");
		Scanner scan = new Scanner(System.in);
		sen = scan.nextLine();
//		System.out.print(sen);
//		System.out.println("\n");
		String ar[] = sen.split(" ");
		
		System.out.println("\nThe sentence before reverse : ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("The sentence after reverse : ");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
