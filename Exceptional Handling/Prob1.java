package exceptionpracticals;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Prob1 {

	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	 System.out.println("ENTER THE VALUE OF x AND y :");
		  try{
		        try{
		            int x = ss.nextInt();
		            int y = ss.nextInt();
		           
		            System.out.println(""+(x/y));
		        }
		        catch (InputMismatchException e){
		            System.out.println("java.util.InputMismatchException");
		        }
		            
		        }
		  catch(Exception e){
		            System.out.println(e);
		        }
		    }
	}
