package marvels_Universe;

public class Variable1 {

	
	public void m1() {
		int a = 100;// Local Variable 
		int b = 200;// Local Variable 
		System.out.println(a);
		System.out.println(b);

	}
	public void m2() {
		String c = "James";// Local Variable 
		String d = "Bond";// Local Variable 
		System.out.println(c);
		System.out.println(d);
	}
	public static void m3() {
		char e = 'E';// Local Variable 
		short f = 127;// Local Variable 
		System.out.println(e);
		System.out.println(f);

	}

	public static void main(String[] args) {
		
		long g = 900;// Local Variable 
		double h = 35.35;// Local Variable 
		System.out.println(g);
		System.out.println(h);
		m3();

		Variable1 v = new Variable1();
		v.m1();
		v.m2();
		
		
	}

}
