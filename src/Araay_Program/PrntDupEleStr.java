package Araay_Program;

public class PrntDupEleStr {
	
	public static void main (String[]args)
	{
	String s = "Samsung";
	// S!=s okay
	s=s.toLowerCase();
	char ch[] = s.toCharArray();
	for(int i =0;i<s.length();i++)
	{
	for(int j=i+1;j<s.length();j++)
	{
	if(ch[i]==ch[j])
	{
	System.out.println(ch[i]);
	}
	}
	}
	}
	}

