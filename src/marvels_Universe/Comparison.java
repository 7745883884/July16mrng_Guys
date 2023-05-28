package marvels_Universe;

public class Comparison {
public static void main(String[]agrs) {
	//logical AND=&&//if the first cond is false then do not need to check 2nd ,directly output will co
	//bitwise AND=&
	int p=150;
	int q=350;
	int r=450;
	int s=950;
	System.out.println(r>q && s>p);//true&&true=true
	System.out.println(q<s && p>q);//true&& false=false
	System.out.println(r<q && p>r);//false=false
	System.out.println(q==s && s>p);//false=false
	//logical or =||
		//bitwise or=|
		int a=150;
		int b=350;
		int c=450;
		int d=950;
		System.out.println(c>b || d>a);//true=true// if the first condition is true then we dont need to check 2nd cond^n
		System.out.println(b<d || a>b);//true|| false=true
		System.out.println(c<b || a>c);//false||false=false
		System.out.println(b==d|| d>a);//false||true= true
		
}
}
