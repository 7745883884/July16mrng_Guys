package Araay_Program;

public class ReplceVowToSpecilChar {
	public static void main(String[]args)
	{
		
		String s = "lokesh";
		char ch1[] =  s.toCharArray();
		for(int i =0;i<s.length();i++)
		{
		for(int j =i+1;j<s.length();j++)
		{
		char ch =ch1[i];
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		ch1[i]='$';
	
		}
		
		}
		
		}
		System.out.print(ch1);
		}
}
		
		
		
		
		
		
		
		
		
		
