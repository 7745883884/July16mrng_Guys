package programOfStr_array;

public class RemoveAllWhiteSpace {

	public static void main (String[]args) {
		
		String str= "  j  a  v a    s ta  r   ";
		//                                                  // we can also remove the space by " " replace to "" empty 
		
		String veer = str.replaceAll("\\s", "");    //      \\s represent the single white space,   ""-represent the empty space
		System.out.println(veer);
                                                 //          iske // jo chij ko remove krna hai vaah type karna hai
		
		                                                    // dont forget to give [] bracket
 
	
	          String jahn =str.trim();       // used just remove the end space
	          System.out.println(jahn);
	
	}
	
	
	
}
