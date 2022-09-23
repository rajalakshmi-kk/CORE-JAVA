package basic;

import java.util.Scanner;
public class VowelOrConsonent {

	public static void main(String[] args) {
		char letter;
		Scanner le = new Scanner(System.in);
		System.out.println("Enter any letter");
		letter = le.next().charAt(0);
		
		switch(letter) {
		case 'a':
			System.out.println("Vowel");
		break;
		
		case 'e':
			System.out.println("Vowel");
		break;
		
		case 'i':
			System.out.println("Vowel");
		break;
		
		case 'o':
			System.out.println("Vowel");
		break;
		
		case 'u':
			System.out.println("Vowel");
		break;
		
		case 'A':
			System.out.println("Vowel");
		break;
		
		case 'E':
			System.out.println("Vowel");
		break;
		
		case 'I':
			System.out.println("Vowel");
		break;
		
		case 'O':
			System.out.println("Vowel");
		break;
		
		case 'U':
			System.out.println("Vowel");
		break;
		
		default : System.out.println("consonent");
		}
		
	}

}
