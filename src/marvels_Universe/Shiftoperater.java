package marvels_Universe;

public class Shiftoperater {
	public static void main(String[]args) {
	int a=10;//a*2^n(left shifting)

  System.out.println(a<<2);//10*2^2=10*4=40
 System.out.println(a<<3); //10*2^3=10*8=80
 System.out.println(a<<4);//10*2^4=10*16
 
	int b=20; // right shift 
 //(b/2^n)
	System.out.println(b>>2);//20/2^2=5
	 System.out.println(b>>3); //20/2^3=2
	 System.out.println(b>>4);//20/2^4=1
	 
	}}
