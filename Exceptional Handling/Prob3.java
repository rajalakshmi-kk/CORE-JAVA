package exceptionpracticals;

public class Prob3 {
	

		public static void main(String[] args) {
			int answer=0;
			try {
				int num = 20;
				int divisor = 0;
				answer = num / divisor;

			} catch (ArithmeticException ae) {
				answer = 0; // line N1
			} catch (Exception e) {
				System.out.println("Invalid division");
			}
			System.out.println("Answer:" + answer);// Line N2
		}

	}


