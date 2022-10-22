package string;

public class AutoBox {

	public static void main(String[] args) {
		int a = 10;
		Integer i  = a;       //autoboxing, compiler will write Integer.value(a);
		Integer j = Integer.valueOf(a);    //before java5
		
		System.out.println(a+" "+i+" "+j);
	}

}
