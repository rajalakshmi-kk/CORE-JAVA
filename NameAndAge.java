package NameAndAge;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your name and age:");
		System.out.println(a.nextLine() + " " + "is my name" + " " + "and"+ " " + a.nextInt() + " "+ "is my present age");

	}

}
