package string;
public class Prob7 {
	public static void main(String[] args) {
		String email = "kkrajalakshmi10@gmail.com";
		int noCount = 0;
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)>='0') {
				if(email.charAt(i)<='9') {
					noCount++;
				}
			}
		}
		
		System.out.println("count of numbers in email id is : "+noCount);
		String email2 = email.replaceAll("[a-zA-Z]", "");
	
		System.out.println("Count of numbers in email id by using regex method : "+email2.length());

		
	}

}
