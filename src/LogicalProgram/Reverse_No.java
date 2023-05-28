package LogicalProgram;

public class Reverse_No {

	
   public static void main (String[]args){

               int rev =0 , remainder , number =1234 ;
                 
                  while(number!=0) {
       
                           remainder = number%10;   //4     3     2     1
                           

                           number = number/10;    //123    12     1     0
                           
                           
                       rev =(rev*10)+remainder ;    // 4    43     432    4321

                  }
                     
                                         
                    System.out.println("Reverse number is="+rev );
           
                 }

  
	  
   }



