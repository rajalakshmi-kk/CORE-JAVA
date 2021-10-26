
public class PassByValue {
	
	public static void modify(int data) {
		data=20;
		
	}
	public static void main(String[] args) {
		int x=10;
		modify(x);
		System.out.println(x);
	}

}
