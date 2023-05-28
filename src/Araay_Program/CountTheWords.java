package Araay_Program;

import java.util.Scanner;

public class CountTheWords {
	public static void main(String[]args)
	{
	//String a = "Welcome to India my friends";
//	Scanner lg = new Scanner(System.in);
//	 
//         String a = lg.nextLine();
//	
//	int count =1;
//	for (int i=0; i<a.length()-1;i++)
//	{
//	if ((a.charAt(i)==' ') && ( a.charAt(i+1)!=' '))  
//	{
//	count++;   
//	}
//	}
//	System.out.println("total words is ="+count);
		
	
//	 String s= "I Love my India ";
//	   String s1[] =s.split(" ");
//
//	   System.out.println("count =" s1.length);
//	   
	
	String d = "Kingkong";
	int count=0;
	for(int i=0;i<d.length();i++)
	{
		char c = d.charAt(i);
		count++;
	}
	System.out.println(count);
	
	}

}
