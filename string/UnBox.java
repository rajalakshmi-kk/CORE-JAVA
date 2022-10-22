package string;

public class UnBox {

	public static void main(String[] args) {
		Integer X = new Integer(20);
		int y = X;   //unboxing , compiler will read  X.intValue()
		int z = X.intValue();
		
		System.out.println(X+" "+y+" "+z);
	}

}
