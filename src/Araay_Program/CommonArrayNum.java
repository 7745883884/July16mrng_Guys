 package Araay_Program;

import java.util.Arrays;

public class CommonArrayNum {
	
	public static void main(String[]args)

	{
		int a[]= {1,6,7,5,9,8};
		//System.out.println(a.length);
	Arrays.sort(a);           // it is used to put number in ascending order
		
		int b[]= {1,4,48,56,5,46};
		Arrays.sort(b); 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
					
			
			if(a[i]==b[j])
			{
				System.out.println("Common data value ="+a[i]);
			}
			}
		}
		
	}

}
