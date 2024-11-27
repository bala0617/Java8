package learn_java;
import java.util.Scanner;


public class SumOf_TwoDigit{
    static int Solution(int n) {
        int a,ans=0;
        for(;n>0;){
            a=n%10;
            n=n/10;
            ans=ans+a;
        }
        System.out.println("The sum of two digit is: " +ans);
        return ans;
        }
    public static void main(String[] args){
       Scanner bal=new Scanner(System.in);
       System.out.println("Enter a number: "); 
    	int n=bal.nextInt();
        Solution(n);
    }
}

