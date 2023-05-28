package Araay_Program;

import java.util.Scanner;

public class ChangeStateAlphabet {

	public static void main(String []args)
	{
		char ch ,ch1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any alphabet ");
		ch = s.next().charAt(0); 
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("The alphabet is covert to lowerCase ");
			ch1=Character.toLowerCase(ch);
			System.out.println(ch1);
		}
		else 
		{
			ch1=Character.toUpperCase(ch);
			System.out.println(ch1);
		}
	}
	
}
