package program_pratices;

public class EquilateralTriangleMirror {
   public static void main(String[]args) {
	   for(int i=1;i<=7;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print("  ");
		   } 
		   for(int k=6;k>=i;k--) {
			   System.out.print(" *");
		   } 	 	
	   for(int l=7;l>=i;l--) {
		   System.out.print(" *");
	   }
	   System.out.println();
   }
}}
