package LogicalProgram;

public class StringWithoutSpace {

	public static void main(String[]args)
	{
		String str = "We are practicing String withou space";
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("total number chhar in string ="+count);
	}
	
}
