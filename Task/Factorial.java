package learn_java;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		System.out.println("enter the number : ");
		int fact = 1;
		Scanner bla = new Scanner(System.in);
		int number = bla.nextInt();
		for(int i=1;i<=number;i++) {
			fact = fact*i;
		}
		System.out.println("factorial of " + number + " is " + fact);
	
	}

}
