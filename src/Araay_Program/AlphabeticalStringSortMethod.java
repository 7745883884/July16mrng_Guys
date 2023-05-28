package Araay_Program;

import java.util.Arrays;

public class AlphabeticalStringSortMethod {
public static void main(String[] args)
{
	String s = "Lokesh";
	s=s.toLowerCase();
	char [] arr =s.toCharArray();
	Arrays.sort(arr);
	System.out.println(arr);
}
}
