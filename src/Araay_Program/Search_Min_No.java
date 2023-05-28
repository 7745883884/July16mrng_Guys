package Araay_Program;

public class Search_Min_No {
   
	public static void main(String[]args)
	{
		int a[] = {5,4,3,-5,98,5,2,1};
		int min = a[0];
		int i;
		for(i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		
		System.out.println("Minimun no is ="+min);
		
		
	}
}
