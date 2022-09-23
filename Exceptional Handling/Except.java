package exceptionpracticals;

public class Except {

	public static void main(String[] args) {
		try {
			int c = 10/0;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code.......");
	}

}
