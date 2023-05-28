package marvels_Universe;

public class Variable3 {
		 static long l= 214778364;//static variable
		static float f= 123.123f;// static variable
		 char c = '&';
		  Short  s = 0;
		  short g = 32767;// instance variable non static method.
		public static void sm() {
		byte a =-128;//local variable in static method.
			 byte b = 127;// local variable in static method.
			   
			System.out.println(b + " is maximum value of byte data type"); 
			System.out.println(a + " is minimum value of byte data type");
			System.out.println(l + " is maximum range of long data type");
		}


		public void nsm() {
			
			
			System.out.println(c + "its size is 1 byte or 1 bit");
			System.out.print(s + "  default value of  short data type ,");
			System.out.println(g+ " is maximum value for same.");
			int h= 4;// local variable in non static method
			System.out.println(h+ "byte is size of int data type");
			System.out.println(f + " is value for float");
		}


		public static void main (String [] args) {
		System.out.println("Its all about primitive data types");
		sm();
		Variable3 goblin = new Variable3();
		goblin.nsm();

		}
		}
