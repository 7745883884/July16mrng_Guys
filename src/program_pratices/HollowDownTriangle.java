package program_pratices;

public class HollowDownTriangle {
public static void main(String[]args) {
	for(int i=1;i<=4;i++) {      
		for(int j=1;j<=i;j++) {   //   right angle triangle star
			System.out.print(" *");
		}
	 for(int k=4;k>=i;k--) {
		 System.out.print(" @");   // right angle triangle space
	 }
	 
	 // right mirror of RAT
	 for(int l=4;l>i;l--) {
		 System.out.print(" @"); 
	 }
	 for(int m=1;m<=i;m++) {
		 System.out.print(" *");
	 }
	 //Down ward triangle
     for(int n=4;n>=i;n--) {         //mirror of 2nd quadrant
    	 System.out.print(" *");
     }
     for(int p=1;p<i;p++) {
    	 System.out.print(" # ");
     }
     // mirror of 1st quadrant
    for(int q=4;q>=i;q--) {
    	 System.out.print(" *");
    	 }
    	 for(int r=1;r<i;r++) {
    		 System.out.print(" %");
    	 }
          
    
	
	
	System.out.println();
	}
}
}