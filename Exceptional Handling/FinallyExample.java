package exceptionpracticals;

public class FinallyExample {

	public static void main(String[] args) {
		System.out.println("Case 1 : where exception does not occured!");
		try {
			String s = "Finally";
			System.out.println("String length = "+s.length());
		} catch (NullPointerException n) {
			n.printStackTrace();
		}
		finally {
			System.out.println("Case 1 : It is always executed");
		}
		System.out.println("Case 1 : rest of the code");
		
		System.out.println("Case 2 : where exception occured and handled");
		try {
			String s = "Finally";
			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException f) {
			f.printStackTrace();
		}
		finally {
			System.out.println("Case 2 : It is always executed");
		}
		System.out.println("Case 2 : rest of the code");
		
		System.out.println("Case 3 : where exception occured and not handled");
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException n) {
			n.printStackTrace();
		}
		finally {
			System.out.println("Case 3 : finally is not executed");
		}
		System.out.println("Case 3 : rest of the code");
	}

}
