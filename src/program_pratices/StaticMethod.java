package program_pratices;

public class StaticMethod {
	
	
	
	public static void printHelloLogic()
	{
	System.out.println("Hello world");
	System.out.println("Hello world");
	System.out.println("Hello world");
	System.out.println("Hello world");
	System.out.println("Hello world");
	}
	public static void addition()
	{
	int a = 10;
	int b = 20;
	int c = a+b;
	System.out.println("c value is"+" " +c);// variable always write with + sign 
	System.out.println(a);
	}
	public static void main(String[] args) {
		printHelloLogic(); // same class method
		addition();// same class method
		printHelloLogic();//same class method
		StaticMethod2.m1(); // Different class method   // class name dot(.)method name();
		StaticMethod.addition();// Same class method
		
		// Call non static method from different class
		
		StaticMethod2 sun=new StaticMethod2();
		//class Name objRefVariable=new class Name();
		//
		sun.kgf2();// we can create here separate object does not need to give same object name as previous class object
		
		
}}
