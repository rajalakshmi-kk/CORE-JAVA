package exceptionpracticals;

public class NestedTryCatchEample {

	public static void main(String[] args) {
		try {
			try {
				String s = null;
				System.out.println(s);
			} catch (NullPointerException e2) {
				e2.printStackTrace();
			}
			
			try {
				String str = "abc";
				System.out.println(Integer.parseInt(str));
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			System.out.println("some other stats...");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code ....");
	}

}
