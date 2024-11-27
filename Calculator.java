package learn_java;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		   //Scanner class for get a user input value
		try (Scanner sum = new Scanner(System.in)) {          
			char YrN = 'y';
			int ans = 0;
			
			for(;YrN=='y';) {
				
			System.out.print("Enter the first number : ");
			int num1 = sum.nextInt();
			System.out.println();
			
			System.out.print("Enter the second number : ");
			int num2 = sum.nextInt();
			System.out.println();
			
			System.out.print("Select the operator: \n"                 //Select a operator
					+ "Addition        '+'\n"
					+ "Subraction      '-' \n"
					+ "Multiplication  '*'\n"
					+ "Divition        '/' \n\n"
					+ "Operator : ");
			 char operator = sum.next().charAt(0);
			 System.out.println();
			 
			 //switch case for arithmetic operation
			 switch (operator) {
			 case '+':
				 int add = num1+num2;
				 System.out.println(num1 + " + " + num2 + " = " + add);
				 System.out.println();
				 ans=add;
				 break;
			 case '-':
				 int sub = num1-num2;
				 System.out.println(num1 + " - " + num2 + " = " + sub);
				 System.out.println();
				 ans=sub;
				 break;
			 case '*':
				 int mul = num1*num2;
				 System.out.println(num1 + " * " + num2 + " = " + mul);
				 System.out.println();
				 ans=mul;
				 break;
			 case '/':
				 int div =num1/num2;
				 System.out.println(num1 + " / " + num2 + " = " + div);
				 System.out.println();
				 ans=div;
				 break;
			 default:
				 System.out.println("invalid input");
				 System.out.println();
				 break;	
			 }
			 
			 //if we continue the calculation press 'y' otherwise press 'n'
			 
			 for(;YrN=='y';) {
				 System.out.print("do you want continue press 'y'\n"
					 			+ "do you want exit press 'n' : " );
				 YrN = sum.next().charAt(0);
				 System.out.println();
				 
				 //if we press 'n' the program will exit and it will give a final answer
				 
				 if(YrN=='n') {
					 System.out.println();
					 System.out.println("program exit");
					 System.out.println();
					 System.out.println("your final value is : " + ans); 
					 break;
				 }
				  
				  //create a third variable for get the value from the user
				 
				 System.out.println("Enter the value : ");
				 int num3 = sum.nextInt();
				 System.out.println();
				 
				 System.out.print("Select the operator: \n"    //select operator for the process
							+ "Addition        '+'\n"
							+ "Subraction      '-' \n"
							+ "Multiplication  '*'\n"
							+ "Divition        '/' \n\n"
							+ "Operator : ");
				 char operators = sum.next().charAt(0);
				 System.out.println();
				 
				 //this switch case for if we continue the process. otherwise press 'n' the will exit.
				 
				 switch (operators) {
				 case '+':
					 int add = ans+num3;
					 System.out.println(ans + " + " + num3 + " = " + add);
					 System.out.println();
					 ans=add;
					 break;
				 case '-':
					 int sub = ans-num3;
					 System.out.println(ans + " - " + num3 + " = " + sub);
					 System.out.println();
					 ans=sub;
					 break;
				 case '*':
					 int mul = ans*num3;
					 System.out.println(ans + " * " + num3 + " = " + mul);
					 System.out.println();
					 ans=mul;
					 break;
				 case '/':
					 int div =num1/num2;
					 System.out.println(ans + " / " + num3 + " = " + div);
					 System.out.println();
					 ans=div;
					 break;
				 default:
					 System.out.println("invalid input");
					 System.out.println();
					 break;	
					 
					 //thank you
				 }
			  }
					  
   }
		}
		 
    } 
}
		
	 
	
	


