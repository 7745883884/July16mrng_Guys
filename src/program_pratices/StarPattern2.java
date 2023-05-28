package program_pratices;

public class StarPattern2 {
  public static void main(String[]args) {
	  
	  
	  //downward decreasing triangle
	  for(int i=1;i<=7;i++) {
		  // 2nd quadrant
		  for(int k=1;k<=i;k++) {
			  System.out.print(" *"); // space
		  } 
		  
		  for(int j=7;j>=i;j--) {
			  System.out.print("  "); // star
		  }
		  // 1st quadrant
		  for(int j=7;j>i;j--) {
	  			System.out.print("  ");
	  		}
	  		for(int k=1;k<=i;k++) {
	  			System.out.print(" *");
	  		}
	  System.out.println();
	  }
	   // downward
	  //3rd quadrant
	 
	  for(int i=2;i<=7;i++) {
		  for(int j=7;j>=i;j--) {
			  System.out.print(" *");// space
		  }
		  for(int k=1;k<=i; k++) {
			  System.out.print("  ");// star
		  }
		  // 4th quadrant
		     for(int l=1;l<i;l++) {
	  			System.out.print("  ");
	  		}
	  		for(int m=7;m>=i;m--) {
	  			System.out.print(" *");
	  		} 
		  
		  System.out.println();
	  }
	  
	  
	  
   
  }

}