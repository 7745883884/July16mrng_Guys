package LogicalProgram;

import java.util.Scanner;

public class PalindromNo {
	
	static int rev=0, Remainder, number;
		/**
		 * @param args
		 */
		public static void main(String[] args) 
			{  
			
			Scanner d = new Scanner(System.in);
			System.out.println("Enter a any number = ");
			 // int rev=0, Remainder, number;
			
				number = d.nextInt();
				
				int temp =number ;
				while (number!=0)
				{
					Remainder = number%10;
					number = number/10;
					rev = (rev*10)+Remainder;
				}
				if(rev==temp) {
					System.out.println(" This is a Palindrome number ="+rev);
				}
				else {
					System.out.println(" This is NOT a Palindrome number = False ");
				}
			}
		}
