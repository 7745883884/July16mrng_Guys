package marvels_Universe;
import java.util.*;

public class CALCLULATER {
	
	public static void main(String[]args) {
		
		Scanner lc = new Scanner(System.in);
		
		System.out.println("add first digit a=");
		int a=lc.nextInt();
		
	System.out.println("add second digit b=");
		int b=lc.nextInt();
		
		
		System.out.println("enter the operater =");
		char z = lc.next().charAt(0);
		switch(z) {
		case '+':
			System.out.println(a+b);
			break;
		
		case '-':
			System.out.println(a-b);
		break;
			
		case '*':
			System.out.println(a*b);
		break;
		case '/':  if(b==0) {
			System.out.println("chutiya sahi no daal");
			
		}
		else {
			System.out.println(a/b); 
			 
			
			
		}
		break;
		
		
		case '%':  if(b==0)	{
			
		
			System.out.println("fir se dhyan dekar daal");
			
		}else {
			
			System.out.println(a/b);
			
			
		}
			break;
			default:
				System.out.println(" ohh bhai maro muze maro ");
			
		}
		
		
	}

}
