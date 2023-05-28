package Araay_Program;

public class UpperCasefstLetter {
	public static void main(String []args)
	{
	
	String s = "life is beautiful enjoy it";     // to remove and add comment press ctrl+c
	String[] parts = s.split(" ");  // split has a return type is array string
//	for(String g : parts)
//	{
//		System.out.println(g);       contl +shift +c
//	}
//	System.out.println(parts);    //[Ljava.lang.String;@2626b418
	
	for(int i=0;i<parts.length;i++){
		char[] ch = parts[i].toCharArray();  // used to convert into array
		// naya array isliye banaye kunki hame 1st latter of words uppercase banana hai
		for(int j=0;j<ch.length;j++){
			ch[0] = Character.toUpperCase(ch[0]);
			System.out.print(ch[j]);
		}
 	System.out.print(" ");


}
	}
}
