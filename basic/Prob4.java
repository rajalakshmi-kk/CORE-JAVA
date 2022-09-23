package basic;

import java.util.Scanner;

public class Prob4 {
	static float avg;
	static int i;
	static int size;
	
	
	public static float avgArray(int a[],int size) {
		int sum=0;
		for(i=0;i<a.length;i++) {
			sum = sum + a[i];
			
		}
		avg=sum/size;
		return avg;
	}
	public static void main(String[] args) {
		
		System.out.println("enter the size of the array");
		Scanner ss = new Scanner(System.in);
		int size = ss.nextInt();
		System.out.println("Array size = "+size);
		
		if(size<=0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else {
			int a[] = new int[size];
			
			for(i = 0;i<a.length;i++) {
				a[i] = ss.nextInt();
				
				if(a[i]<0) {
					System.out.println("Invalid input");
					System.exit(0);
				}
				
			}
			
				float average = avgArray(a,size);
				System.out.println(average);
			
		}
	}

}
