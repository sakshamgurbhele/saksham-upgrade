package conditionalStatements5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st Number = ");
		int a =sc.nextInt();
				
		System.out.println("Enter the 2nd Number");		
        int b =sc.nextInt();
        
        System.out.println("What kind of Operation you want?");
        sc.nextLine();
       
        char operation = sc.nextLine().charAt(0);
        
        int result = 0;
        
        switch(operation) {
        case '+':
        	result=a+b;
             break;
        
        case '-':
        	result=a-b;
        	 break;
        case '*':
        	result=a*b;
        	break;
        	
        case '/':
        	result = a/b;
        	break;
        	
        	default:
        	System.out.println("Operation invalid");
   
     }
        
   System.out.println("Your desired answer after calculaton is = "+ result);     
	}      
}