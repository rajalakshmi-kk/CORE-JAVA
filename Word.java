
public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Rajalakshmi";
		System.out.println(word.toUpperCase());
		
		String word1=word.toLowerCase();
		System.out.println(word1);
		
		int w = word.length();
		System.out.println(w);
		
		System.out.println(word.isEmpty());
		
		char x=word.charAt(0);
		
		System.out.println(x);
		String letter = word.concat("2001");
		System.out.println(letter);

	}

}
