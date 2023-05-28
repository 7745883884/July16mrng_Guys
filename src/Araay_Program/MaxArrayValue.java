package Araay_Program;

import java.util.Scanner;

public class MaxArrayValue {
	public static void main(String[]args)
	{
	    int a[]=new int[5];

	Scanner lg =new Scanner(System.in);
	System.out.println("Enter Array Number =");
	for(int i=0;i<5;i++)
	{
	 a[i]=lg.nextInt();
	}
	int max =a[0];
	for(int i=0;i<5;i++)
	{
	 if (max<a[i])
	{
	// max =a[i];
	 max =max +a[i];            // sum of array
	 
	}
	}
	System.out.println("Max number is ="+max);
	}
	}


