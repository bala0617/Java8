package learn_java;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		
		Scanner bal=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num = bal.nextInt();
	    int prime = 0;
	  for(int i=2; i<=num/2;i++){
       if(num%i==0){
	        prime=1;
	        break;
	           	} 
	       }
	    if(prime==0){
	       System.out.println(num + " is a prime number");
	    }
	    else{
	       System.out.println(num + " is not a prime number");
	   }
		bal.close();
		
		
		
		
	}


}
