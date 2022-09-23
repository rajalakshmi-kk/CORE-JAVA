package exceptionpracticals;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int a[] = new int [5];
			a[7] = 20/0;
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code......");
	}

}
