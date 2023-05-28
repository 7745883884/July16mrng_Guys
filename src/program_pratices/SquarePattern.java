package program_pratices;

public class SquarePattern {
      public static void main(String[]args) {
    	  //outer loop
    	  for(int i=1;i<=8;i++) {
    		  //inner loop
    		 // for(int j=1;j<=i;j++) {
    			//  System.out.print(" *");
    		//  }
    	 // for(int k=8;k>i;k--) {
    		//  System.out.print(" &");
    	  
     // }
    	  for(int l=1;l<=i;l++) {  //space
    		  System.out.print("  ");
    	  }
    	  for(int m=1;m<=i;m++) {
    		  System.out.print(" *");
    	  
     }     System.out.println(); 
}
}}