package LogicalProgram;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[]args)
	{
	//	String str = "Welcome to the world of java programing";
		
		Scanner lg = new Scanner(System.in);
		System.out.println("Enter words of string == ");
		String str = lg.nextLine();
		
		char chars[] = str.toCharArray();  //Converting the given String into character array

		
		int count =0;
		for(char c : chars)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				System.out.println(c);
				break;
				
			
			
			}
		}
		
		System.out.println("Numbers of vowels in string = "+count);
		
	}
	
}
