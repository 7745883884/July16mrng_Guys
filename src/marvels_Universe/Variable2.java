package marvels_Universe;

public class Variable2 {
	// Instance/Non Static/Class  variable 
		static String dil = "Dilawar Bhai";
		static String jor = "Jorawar Bhai";
		// Static Variable 
		
		public void juhu() {
			System.out.println(dil);
			System.out.println(jor);
		}
		
		public void bhaykhala() {
			System.out.println(dil);
			System.out.println(jor);
		}
		
		public static void wadala() {
			String man = "Maniya Bhai"; 
			String jub = "Juber Bhai";
			System.out.println(man);
			System.out.println(jub);
			System.out.println(dil);
			System.out.println(jor);
		}
				
		public static void main(String[] args) {
			wadala();
			Variable2 k = new Variable2();
			k.juhu();
			k.bhaykhala();
			System.out.println(dil);
			System.out.println(jor);
		}
				
		
		
		
		
	}


