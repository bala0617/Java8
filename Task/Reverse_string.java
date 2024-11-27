package learn_java;
import java.util.Scanner;
public class Reverse_string {

	public static void main(String[] args) {
		
		Scanner bal = new Scanner(System.in);
		System.out.print("Enter the String : ");
		
		String name = bal.nextLine();
		
		char[] b = name.toCharArray();
		int len = name.length();
		
		for(int i= len-1;i>=0;i--) {
			
			System.out.print(" Reverse the given string is " +  b[i]);
			
		}
		
	}

}
