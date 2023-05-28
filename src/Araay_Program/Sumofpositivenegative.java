package Araay_Program;

import java.util.Scanner;

public class Sumofpositivenegative {

	public static void main(String[] args) {
		
		Scanner lg = new Scanner(System.in);
		int a[] =new int[5];
		
		for(int i=0;i<a.length; i++)
		{
		System.out.println("Enter any number " );
		a[i]=lg.nextInt();
		}
		
	
		int positiveSum = 0;
		int negativeSum =0;
		
		for(int i=0;i<a.length; i++)
		{
		if(a[i]%2==0) { 
			positiveSum= positiveSum+a[i];
			
			
		}
		
		else 
		negativeSum=negativeSum+a[i];
		
		
		}
		
		System.out.println(positiveSum);
		System.out.println(negativeSum);
		}
		}
	


