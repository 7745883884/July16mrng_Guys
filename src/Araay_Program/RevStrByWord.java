package Araay_Program;

public class RevStrByWord {

	public static void main(String[]args)
	{
		String s ="lokesh";
		String s1="";
		char[] ch =s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			s1 =ch[i]+s1;
		}
		System.out.println(s1);
	}
	
}
