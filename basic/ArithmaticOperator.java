package basic;
import java.util.Scanner;
public class ArithmaticOperator {
public static void Addition() {
	int a,b,c;
	Scanner sb = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	a = sb.nextInt();
	b = sb.nextInt();
	c = a+b;
    System.out.println("Addition of two numbers is :"+c);
}
public static void Subtraction() {
	int x,y,z;
	Scanner sub = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	x = sub.nextInt();
	y = sub.nextInt();
	z = x-y;
    System.out.println("Subtraction of two numbers is :"+z);
}
public static void Multiplication() {
	int p,q,r;
	Scanner mul = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	p = mul.nextInt();
	q = mul.nextInt();	
	r = p*q;
    System.out.println("Multiplication of two numbers is :"+r);
}
	public static void main(String[] args) {
		Addition();
		Subtraction();
		Multiplication();
	}

}
