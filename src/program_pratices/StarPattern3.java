package program_pratices;

public class StarPattern3 {
    public static void main(String[]args) {
    	for(int i=1;i<=7;i++) {
    		for(int j=7;j>=i;j--) {
    			System.out.print(" *");
    		}
    	for(int k=1;k<=i;k++) {
    		System.out.print("  ");
    	}
    		System.out.println();
    	}
    	
    
    for(int i=2;i<=7;i++) {
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