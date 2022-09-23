package basic;

public class OddNumbers {

	public static void main(String[] args) {
		int i,sum=0;
		for(i=25;i<=50;i++) {
			if(i%2 !=0) {
				sum = sum+i;
			}
		}
		System.out.println("The of odd number between 25 and 50 = "+sum);
	}

}
