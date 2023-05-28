package Araay_Program;

public class ArrayInAccendingOrder {

	public static void main(String[]args)
	{     
		int a[]= {12,17,10,14,4};
		int temp = 0;
		
		for(int i=0;i<a.length;i++)           // i used for only selection of values
		{
			for(int j=i+1;j<a.length;j++)     
			{
			if(a[i]>a[j])                     // j is used shfiting the position of value
			{
				temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		
				
			}
		}
		 
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+",");
		}
		
	
	}
	
}
