package program_pratices;

import java.util.*;

public class Calculator4 {

	public static void main(String[] args) {
		System.out.println("--------------------------------------");
	    System.out.println("---------  Welcome to Casio  ---------");		
        System.out.println("--------------------------------------");
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter your first number: a= ");
		double a=sk.nextDouble();
		System.out.println("Enter your second number: b= ");
		double b=sk.nextDouble();
		System.out.println("Select the operater: add-a,...sub-s,....mul-m,...div-d ");
		 char op = sk.next().charAt(0);
		switch(op) {
		case 'a': 
			System.out.println("Sum of the given two numbers: "+(a+b));
			break;
		case 's':
			System.out.println("Subtraction of the given two number: "+(a-b));
			break;
		case 'm':
			System.out.println("Multiplication of the given two number: "+(a*b));
			break;
			
		case 'd': 
			System.out.println("division of the given two number: "+(a/b));
			break;
			default :
				System.out.println(" Error!\tPlease check your input ");
			
			
			
	
		}
		
		
		
	}
	
	
}
