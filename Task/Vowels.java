package learn_java;
import java.lang.System;
import java.util.Scanner;
class Vowels{
	
	public static void main(String[]args)
	{
	
		Scanner bal = new Scanner(System.in);
		char YrN='Y';
		for(;YrN=='Y';) {
			System.out.print("enter a character: ");
			char vowels = bal.next().charAt(0);
			switch(vowels) {
			case 'a','e','i','o','u','A','E','I','O','U':
				System.out.println(vowels+ " is a vowels.");
			    break;
			    
			default:
				System.out.println(vowels + " is a constant");
				break;
		}
			System.out.println("do you want continue? -> press 'Y'\n "
					+ "do you want to exit? -> press 'N'");
			YrN=bal.next().charAt(0);
			if(YrN=='N')
			System.out.println(" successfully exit");
		}
		
}
	}
