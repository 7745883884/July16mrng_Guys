package LogicalProgram;

import java.util.Scanner;

public class SumofEvenOdd {
	

		public static void main(String[] args) {
			
			Scanner lg = new Scanner(System.in);
			int a[] =new int[5];
			
			for(int i=0;i<a.length; i++)
			{
			System.out.println("Enter any number " );
			a[i]=lg.nextInt();
			}
			
		
			int evenSum = 0;
			int oddSum =0;
			
			for(int i=0;i<a.length; i++)
			{
			if(a[i]%2==0) { 
				evenSum= evenSum+a[i];
				
				
			}
			
			else 
			oddSum=oddSum+a[i];
			
			
			}
			
			System.out.println("EvenNuSum ="+evenSum);
			System.out.println("OddNuSum ="+oddSum);
			}
			}
		




