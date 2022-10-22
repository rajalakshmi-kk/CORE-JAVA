
/*
  check the string is palindrome
 */



package string;
import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		String word="madam",letter="";
        //System.out.println("Before swapping : "+word);
		
        for(int i=word.length()-1; i>=0; i--) {
        	letter = letter + word.charAt(i);
        }
        
        System.out.print("after swapping : " +letter);
        
        System.out.print("\n");
        
        if(letter.equals(word)) {
        System.out.println("Palindrom");}
        
        else {
        	System.out.println("Not Palindrom");}
	}
}
