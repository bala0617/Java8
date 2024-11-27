package learn_java;
import java.lang.System;
import java.util.Scanner;

public class Odd_even {
	
	public static void main(String[]args) 
	{
		System.out.println("Enter the number : ");
		Scanner bla = new Scanner(System.in);
		int num1 = bla.nextInt();
		
		System.out.println("given the number is  : ");
		if(num1%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}




