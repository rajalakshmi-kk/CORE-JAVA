package basic;
import java.util.Scanner;
public class Tax
{
	public static void main(String args[])
	{
	double tax,salary;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	salary = sc.nextDouble();
	tax = salary*0.12;
	System.out.println("Tax amount = "+tax);
	}
}
