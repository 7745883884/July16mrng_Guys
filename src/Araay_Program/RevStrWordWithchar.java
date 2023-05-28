package Araay_Program;

public class RevStrWordWithchar {


	public static void main(String[]args)
	{
//	String s1 ="";
//	String s="Welcome to India";
//	char ch[] = s.toCharArray();
//	for(int i=0;i<s.length();i++)
//	{
//	s1=ch[i]+s1;           //w   ew   lew...emoclew
//	}
//	System.out.println(s1);
//	}
//	}

     String s="Welcome to India";
       System.out.println(s.length());    //16 char
//       char ch[] = s.toCharArray();
//       System.out.println(ch.length);   //16
       String s1[]=s.split(" ");
     System.out.println(s1.length);      //3  word become char
     String s2="";
     //for(int i=0;i<s.length();i++)  //Index 3 out of bounds for length 3
     for(int i=0;i<s1.length;i++)
       
    		{
    		s2=s1[i]+s2;           //w   ew   lew...emoclew
    		}
    		System.out.println(s2);

	}
}



