package Araay_Program;

public class Search_Max_No {
	
	public static void main(String[]args)
	{
		int[] a = {4,5,3,7,8,10,9};
		
		int max = a[0];
		for(int i = 1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		
		System.out.println("Maximum no is ="+max);
		
		
		
		
		
	}

}
