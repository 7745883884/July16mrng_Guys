package program_pratices;

public class CuboidStar {
	
	public static void main(String[]args) {
		  
		  
		  //downward decreasing triangle
		  for(int i=1;i<7;i++) {
	
	
	 for(int j=7;j>i;j--) {
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
		// 2nd quadrant
		  for(int k=1;k<=i;k++) {
			  System.out.print(" *"); // space
		  } 
		  
		  for(int j=7;j>=i;j--) {
			  System.out.print("  "); // star
		  }  
		  
		  System.out.println(); 
		  }
		  
		  //downward
		  for(int i=1;i<=7;i++) {
		
		     for(int l=1;l<i;l++) {
	  			System.out.print("  ");
	  		}
	  		for(int m=7;m>=i;m--) {
	  			System.out.print(" *");
	  		} 
	  		  
	  		  for(int j=7;j>=i;j--) {
	  			  System.out.print(" *");// space
	  		  }
	  		  for(int k=1;k<=i; k++) {
	  			  System.out.print("  ");// star
	  		  }
	  		  System.out.println();

		  }
	}
}
	  		  
	  		  
	  		  
