 package marvels_Universe;

public class Method_Calling_Outside_Class {
	 public static void x() {
		System.out.println("x is also a Static Method");
	}
	public void y() {
		System.out.println("y is also a Non Static Method");
	}
	
	public static void main (String [] args) {
		
		Method_Calling_Outside_Class m = new Method_Calling_Outside_Class();
		Method_Calling_Same_Class x = new  ();
		x.a2();
		m.y();
		Method_Calling_Same_Class.a1();
		x();v
		
	}
}






a2 is Non Static Method
y is also a Non Static Method
a1 is Static Method
x is also a Static Method

Group:  AE

📆Date: 15/08/2022
Mock number: 16

📒Topics for Today: 
1. Methods 
2. SDLC
3. Data types 
4. Veritable types




Attendance: ☑️

  1. Akshay Bhagat  ✅
  2. Shrotee Pandey ✅
  3. Akanksha Bobale✅
  4. Swapnil kadam❌
[10:40 pm, 15/08/2022] +91 85528 54924: package practicePrograms;

public class ThisKeyword 
{
	
		int a = 10;
		int b = 20;
		

		public void check() 
		{
			int a = 50;
			int b = 30;
			
			System.out.println("Your Name is = " + this.a);
			System.out.println("Your Name is = " + this.b);
			
		}
		
		public static void main(String[] args) 
		{
			ThisKeyword t = new ThisKeyword();
			t.check();	
		}		

}

}
