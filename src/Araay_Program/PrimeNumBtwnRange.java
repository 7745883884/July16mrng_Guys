 package Araay_Program;

public class PrimeNumBtwnRange {    // Find prime number between 1 to 100;

	public static void main(String[]args)   // note to hide things with // then press ctrl+shift+c
	{
		int temp=0;
		
		for(int nu =1;nu<=100;nu++)
		{
			for(int i=2;i<nu-1;i++)
			{
				if(nu%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(nu);
			}
			else
			{
				temp=0;
			}
			}
		}
	}