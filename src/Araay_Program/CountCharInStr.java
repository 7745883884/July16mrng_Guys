package Araay_Program;

public class CountCharInStr {

	
	
	public static void main(String[]args)
	{
	String s ="I love my country and my state";
	int count=0;
	for(int i =0;i<s.length();i++)
	{
	char ch =s.charAt(i);
	if(ch!=' ')          // bad operand type char for unary operator '!'
	{
	count++;
	}

	}
	System.out.println(count);
	}

	}

