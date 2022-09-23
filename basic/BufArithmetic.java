package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufArithmetic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,c,d,e,f,g;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter 2 numbers :");
	        a = Integer.parseInt(br.readLine()); 
	        b = Integer.parseInt(br.readLine());
	        c = a+b;
	        d = a-b;
	        e = a*b;
	        f = a/b;
	        g = a%b;
	        System.out.println("Addition is : "+c);
	        System.out.println("Subtraction is : "+d);
	        System.out.println("Multiplication is : "+e);
	        System.out.println("Division is : "+f);
	        System.out.println("Modulo is : "+g);
	}

}
