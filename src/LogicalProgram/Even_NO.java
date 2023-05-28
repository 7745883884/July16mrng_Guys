package LogicalProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_NO {

	public static void main(String[]args) {
		  Scanner lc = new Scanner(System.in);
		  System.out.println("Enter any no ---");
		//ArrayList data = new ArrayList();
		  int no = lc.nextInt();
		if(no%2==0)
		{
			System.out.println("No is even ");
		}
	 else
	{
		 System.out.println("No is odd ");	
	}
	
}
}

