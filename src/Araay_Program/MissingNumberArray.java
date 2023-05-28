package Araay_Program;

public class MissingNumberArray {
	
	public static void main(String[]args)
	{
		// Array should not have duplicate 
		//Array no need to be sorted order  
		//we can add in assending/decending/mix order
		//value should not be in range    
		
		int a[]= {1,2,4,5,6};
		//1+2+4+5+6=18    sum1
				//1+2+3+4+5+6=21  sum2
		//sum2-sum1=3
		int sum1 = 0;
		for(int i=0;i<a.length;i++)
		{
			sum1 =sum1+a[i];
			
			
		}
		System.out.println("First sum = "+sum1);
		
		
		int sum2 = 0;
		for(int j=1;j<=6;j++)    //dont put j=0 otherwise sum will become less than previous
		{                        // here we are no assing /reading any element from array 
			sum2 =sum2+j;        // it is a sum of range 1+2+"3"+4+5+6
			
		}
	
		System.out.println("Second sum = "+sum2);
		
		System.out.println("Missing number is = "+(sum2-sum1));
		
		}
  
}
