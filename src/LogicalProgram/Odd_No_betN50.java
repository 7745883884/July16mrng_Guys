package LogicalProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Odd_No_betN50 {

	
	public static void main(String[]args) {
		
		  ArrayList data = new ArrayList();
		  
		  for(int i=1;i<=50;i++)
		  {
			  if(i%2==1)
			  {	
				  data.add(i);
			
			  }
		  }
			 
		  
		  System.out.println("Total odd no is _= "+data);
     } 
}
