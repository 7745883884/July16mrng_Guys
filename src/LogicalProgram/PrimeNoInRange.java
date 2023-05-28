package LogicalProgram;

public class PrimeNoInRange {
	public static void main(String[]args)
	{
		
	int i, j;
	String primeNumbers ="";
	for(i=2; i<=50; i++)
	{
		int counter = 0;
		for(j=1; j<=i; j++) 
		{
			
			if(i%j==0)
			{
				counter = counter + 1;
			}
		}	
			
		if(counter == 2)
		{
			primeNumbers = primeNumbers + i+",";   // 
		}
	}
	System.out.println("Prime number is="+primeNumbers);
  }


}
