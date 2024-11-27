package learn_java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner bal = new Scanner(System.in);
	System.out.println("enter number: ");
	int r = bal.nextInt();
	int a=0,b=1,c;
	System.out.print(a+" "+b);
	for(int i=1;i<=r-2;i++) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	bal.close();
	
	}

}
