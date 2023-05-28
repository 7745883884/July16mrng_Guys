package loopStatement;

public class LoopStatement {
public static void main(String[] args) {

    
	{
		int rev=0, Remainder, number=121;
		
		while (number!=0)
		{
			Remainder = number%10;
			number = number/10;
			rev = (rev*10)+Remainder;
		}
		System.out.println("Reverse number is="+rev);
	}
}

	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
