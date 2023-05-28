package Araay_Program;

public class DuplicateWords {
	
  public static void main(String[]args)
  {
	  String wld = "hey java is java is the best language";
	   String arr[]= wld.split(" ");
	   // System.out.println(arr);   // [Ljava.lang.String;@2626b418
	  
	   for(int i =0;i<arr.length;i++)
	   {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i].equals(arr[j]))  
				  
//				  In the given program, the comparison of strings using the == operator is incorrect. 
//				  The == operator compares object references rather than the actual content of the strings. 
//				  To compare the content of strings, you should use the equals() method. 
			  {
				  System.out.println(arr[i]);
			  }
		  }
		       	
	   }
//	  
	   
	    
  }

}
