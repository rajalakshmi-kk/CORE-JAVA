/**
package program;

import java.util.Scanner;

public class Practical5 {
	int n,r,j=0,m=0,k=0;
	
	public int generateCode(int coupon)
	{
		n=coupon;
	    	
		while (n != 0)
		  {
		    r = n % 10;
		    n = n / 10;
		    if(r%2==0)	 
		    {
		    	m=m*10+r;
		    }
		
		  }
		return m;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coupon ,s=0,r,c;
		Practical5 p=new Practical5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Copon code: ");
		coupon=sc.nextInt();
		if(coupon<0)
			System.out.println("Number is too Small");
		else if(coupon>32767)
			System.out.println("Number is Too Large");
		else {
		c=	p.generateCode(coupon);
		
		while(c!=0)
		{
		r=c%10;
		s=s*10+r;
		c=c/10;
		}
	System.out.println(s);
		}
	
	}

}

**/

package string;
import java.util.Scanner;
public class Prob1 {
	public int generateCode(int coupon){
		int res=0,rem=0,i=1;
		while(coupon!=0){
			rem=coupon%10;
			if(rem%2==0){
				res=res+(rem*i);
				i=i*10;
			}
			coupon = coupon/10;
		}
		return res;
	}
	public static void main(String[] args) {
		int coupon=0,code=0;
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the coupon");
		coupon = ss.nextInt();
		if(coupon<0)
			 System.out.println("Number too small");
		else if(coupon>32767)
			System.out.println("Number too large");
		else{
			Prob1 p = new Prob1();
			code = p.generateCode(coupon);
			if(code==0)
				 System.out.println("0");
			else
				 System.out.println(code);
		}
//		getchar();
//		getchar();
//		return 0;
	}

}

/**
Read the question carefully and follow the input and output format.

In a game show everybody got one coupon with some code. They need to generate a code with only even numbers in that coupon. Find the answer.

Input and Output Format :
Input consists of  an integer. Output consist of an integer, which is the generated code.

1) Print "Number too small" when the given input number is a negative number.
2) Print "Number too large" when the given input number is greater than 32767.
3) Print 0 If the coupon does not contain any even numbers.

Include a function named generateCode(int coupon) whose return type is an integer, which is the generated code.

Sample Input 1:
4352

Sample Output 1:
42

Sample Input 2:
1357

Sample Output 2:
0

Sample Input 3:
-1357

Sample Output 3:
Number too small

**/