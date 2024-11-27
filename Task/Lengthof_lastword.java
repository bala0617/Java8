package learn_java;

import java.util.Scanner;

public class Lengthof_lastword {

	public static void main(String[] args) {
		int count=0;
		try (Scanner let = new Scanner(System.in)) {
			System.out.print("Enter the string : ");
			String name = let.nextLine();
			name = name.trim();
			char[] a =name.toCharArray();
			int l = name.length();
			for(int i=l-1;i>0;i--) {
				if(a[i]=='.')
					continue;
				if(a[i]!=' ') {
				count++;
				continue;
			}
			break;
			}
		}
		System.out.println("Length of last word is "+count);
	 }
		
}

