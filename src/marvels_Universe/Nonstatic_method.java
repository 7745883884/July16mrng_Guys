package marvels_Universe;

public class Nonstatic_method {
	public static void main(String[]args) {
		
		Nonstatic_method boss = new Nonstatic_method();	
		boss.t1();
		boss.t2(); 
		boss.t3();
		boss.t4();
	}
	
		public void t1() {
			System.out.println("T1 is non static Method");
		}
		public void t2() {
			System.out.println("T2 is non static Method");
		}
		
		public void t3() {
			System.out.println("T3 is non static Method");
	}
		public void t4() {
			System.out.println("T4 is non static Method");
}
	
}