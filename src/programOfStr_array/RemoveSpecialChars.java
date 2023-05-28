package programOfStr_array;

import java.util.Scanner;  // ashok it Ytube

public class RemoveSpecialChars {

	public static void main(String[]args) {
		String str;
		
	   Scanner lc =new Scanner(System.in);
		str=lc.next();
		//"$ja!va$@&st%ar mixture of character
		
				//approch-1 (replaceAll()method)
				//^ this sign show the anything other than this replace[]
                     
	String plainstr=str.replaceAll("[^a-zA-Z0-9]", "");
	
		
		System.out.println(plainstr);
		
	

	}
}
