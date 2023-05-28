package LogicalProgram;

import java.util.Scanner;

public class Prime_No_2 {

//https://www.youtube.com/watch?v=uQHPYakSKI4&list=PPSV     /// recomment this Programe
	public static void main(String[]args)
	{     

	        Scanner sn =new Scanner(System.in);
	        System.out.println("Enter Any No.--");
	        int n = sn.nextInt();
	        int  count =0 ;
	              for(int i=1;i<=n;i++)
	              {     
	                  if (n%i==0)
	                {
	                   count ++;
	                }  
	            }
	  
	                if(count==2)  
	                {// if we take other no then the count always more than 2 ;
	                          System.out.println("The no is prime no");
	                }
	                else {   // your choice if you want to block/body or not 
	                         System.out.println("The no is Not prime no");
	                }
	         }	
	}
