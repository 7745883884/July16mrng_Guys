package LogicalProgram;

public class WordsSelect {
	
	public static void main(String[]args)
	{
	String s ="Java is the best Language";
	String w =""; s+=" ";//string always written double cote

	for(int i =0;i<s.length();i++)
	{
	char c = s.charAt(i);
	if(c!=' ')   // char always written single cote
	{
      w=w+c;
	
	}
	else 
	{
	if(w.length()==5)     //word complete hone ke bad jaise h space milega to check karega length
	{
	System.out.println(w);
	}

	
	//   print ke bad samane wale word ko cheke karna padega na uske liye null kr diya 
	w=""; 
	}
	}
	}
	}


