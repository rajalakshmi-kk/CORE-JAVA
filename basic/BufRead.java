package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufRead {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        int a,b,c;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers :");
        a = Integer.parseInt(br.readLine()); 
//        this readLine()- will only accept the String. so we are putting it into the Integer.parseInt()
        b = Integer.parseInt(br.readLine());
        
        c = a-b;
        System.out.println("Subtraction is : "+c);
	}

}
