
/*
 Reverse a string
 */





package string;
import java.util.Scanner;
public class Prob4 {

	public static void main(String[] args) {
		String word="Raji",letter="";
//		Scanner ss = new Scanner(System.in);
//		word = ss.next();
        System.out.println("Before swapping : "+word);
        
        for(int i=word.length()-1; i>=0; i--) {
        	letter = letter + word.charAt(i);
        }
        System.out.print("after swapping : " +letter);
	}

}
