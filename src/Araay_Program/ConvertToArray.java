package Araay_Program;

public class ConvertToArray {

	public static void main(String[] args) {
		String a ="lokesh";
		//creating array of string length
		//using length() method

		char[] ch =new char[a.length()];// declr

		//copying character by character into arry
		//using for each loop

		for(int i =0;i<a.length();i++)
		{
		ch[i]= a.charAt(i);
		}
      for(int j=0;j<ch.length;j++)
{
	System.out.print(ch[j]+",");
}
		
		}
		//printing the element of array
		//using for each loop
		//System.out.print(ch+",");  // print id [C@2626b418

		//for(char c : ch)
		{
		//System.out.print(c+",");
		}
		}

	

