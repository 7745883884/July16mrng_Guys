package program_pratices;

public class StarPattern22 {
    public static void main(String[]args) {
    	for(int i=1;i<=7;i++) {
    		for(int j=7;j>i;j--) {
    			System.out.print("  ");
    		}
    		for(int k=1;k<=i;k++) {
    			System.out.print(" *");
    		}
    		    System.out.println();
    	}
    		
     for(int i=2;i<=7;i++) {
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
