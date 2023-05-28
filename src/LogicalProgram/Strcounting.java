package LogicalProgram;

public class Strcounting {

	public static void main(String []args)
	{

	String str = "world of king";
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
	char c = str.charAt(i);
	if(c!=' ')
	 count = count+1;
	}
	System.out.println(count);
	}
	}  

