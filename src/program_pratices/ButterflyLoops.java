package program_pratices;

public class ButterflyLoops {
	public static void main(String[]args) {
		  
		  
		  //downward decreasing triangle
		  for(int i=1;i<=7;i++) {
			  
			  for(int k=1;k<=i;k++) {
				  System.out.print("  "); // space
			  }
			  
			  for(int j=7;j>=i;j--) {
				  System.out.print(" *"); // star
			  }
			// mirror of right decreasing triangle	
			  for(int j=7;j>=i;j--) {
	    			System.out.print(" *"); //STAR
			  } 	
	    	for(int k=1;k<=i;k++) {
	    		System.out.print("  "); //SPACE
	    	}
		  System.out.println();
		  }
		   // BOTTOM 
		  for(int i=2;i<=7;i++) {
			  for(int j=7;j>=i;j--) {
				  System.out.print("  ");// space
			  }
			  for(int k=1;k<=i; k++) {
				  System.out.print(" *");// star
			  }  
			    	for(int j=1;j<=i;j++) {
			    		System.out.print(" *");// star 
			    	}
			    	for(int k=6;k>=i;k--) {
			    		System.out.print("  "); // space}
			    	}
			  System.out.println();
		  }
		  
		  
		 
	    }
		  
	  }

	
