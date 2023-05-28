package Araay_Program;

public class DupCharString {
public static void main(String[]args)   //not working propery
{
	String s = "amalanagaml";
	char arr[] = s.toCharArray();
	
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(arr[i]==arr[j])
			{  
				
				System.out.println("duplicate char are "+arr[i]);
	
				break;
				
			}
				
		}
		
	}
}
}
