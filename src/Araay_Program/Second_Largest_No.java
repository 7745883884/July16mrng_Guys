package Araay_Program;

public class Second_Largest_No {
	
	public static void main(String[]args)
	{
		int[]a = {6,8,2,3,1,5,7,9};
				
		int temp = 0 ;
		for(int i=0;i<a.length;i++)            // i=0;
		{
			for(int j=1;j<a.length;j++)       //1     2    3 .....8
			{
				if(a[i]<a[j])                // 6<8   8<2  8<3....8<9
				{ 
					temp =a[i];             // 6           temp=8
					a[i]=a[j];            //  8           a[i}=  9
					a[j]=temp;            //   8            a[j] =9
					
					
				}                             
			}
		}
		System.out.println("Second largest Element is "+a[6]);
	}

}
