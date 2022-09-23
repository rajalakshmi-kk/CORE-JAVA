package exceptionpracticals;

import java.util.InputMismatchException;

public class MultiCatch2 {

	public static void main(String[] args) {
		try {
			int a[] = new int [5];
			a[7] = 20/0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
