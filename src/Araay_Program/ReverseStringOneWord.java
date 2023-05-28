package Araay_Program;

public class ReverseStringOneWord {

	public static void main(String[]args)
	{
	         String name = "Lokesh ramesh";
	      //   String name[] = {"Lokesh ramesh"};          // string arry k tarah karenge tb bracket used nah karenge
	         
	//int size= name.length( ) ;

	    String rev ="" ;
	for( int i = name.length()-1; i>=0; i--)    // jab normal variable likhenege tb used () like name.length()
	//	for( int i = name.length-1; i>=0; i--)   
	{
	   rev =rev+name.charAt(i);
	   System.out.println(name.charAt(i));       // to write the seprate single character
	} 
	 System.out.println( "Name  is =" +rev);
	} 
	}
