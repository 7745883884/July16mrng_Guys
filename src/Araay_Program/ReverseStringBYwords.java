package Araay_Program;

public class ReverseStringBYwords {

	public static void main(String[]args)
	{
		String s = "life is beautiful enjoy it";
		//for reverse purpose we have to used array
		String[] parts = s.split(" ");   // it will split the words in diff value in array
	
		for(int i=parts.length-1;i>=0;i--)   // if split beauti-ful  it will divided into 2 dif word
		
			System.out.print(parts[i]+" ");


		
	}
}
