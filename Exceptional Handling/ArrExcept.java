package exceptionpracticals;
import java.util.Scanner;
public class ArrExcept {
	int arr[],t=0,len,temp;
	public int arraycal(int arr[], int len) {
		for(int i=0;i<len;i++) {
			if(arr[i]>t) {
				t=arr[i];
			}
		}
		for(int i=0;i<len;i++) {
			if(arr[i]>temp && arr[i]<t) {
				temp = arr[i];
			}
		}
		return(temp);
	}
		
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = ss.nextInt();
		if(n<0) {
			System.out.println("Invalid size!.....");
			System.exit(0);
		}
		int arr[] = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = ss.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid!");
				System.exit(0);
			}
			
		}
		ArrExcept ar = new ArrExcept();
		int second = ar.arraycal(arr, n);
		System.out.println("Second largest = "+second);
	}

}


/**
Read the question carefully and follow the input and output format.

Write a function to find second largest number in the given input integer array.

Assume that all elements in the input array are unique.

Input and Output Format :

First line of input consists of n, the number of elements. Next n lines correspond to the array elements.
Output consist of an integer, which is the second largest.

1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Include a function named secondLargest(int array[], int size) whose return type is an integer, the second largest.

Sample Input 1:
5
3
342
53
2
12

Sample Output 1:
53

Sample Input 2:
5
3
342
53
-2


Sample Output 2:
Invalid input
**/