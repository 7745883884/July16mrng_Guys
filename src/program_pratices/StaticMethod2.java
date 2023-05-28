package program_pratices;

public class StaticMethod2 {
	public static void m1()
	{
	System.out.println("m1 is a method from other class having a name StaticMethod2");
	}
	
	public void kgf2() {
	System.out.println("Hii..! I called from staticmethod2 class");  
	}
	
	
	  public static void main(String[]args){
	  m1();
	  
	  StaticMethod2 knif= new StaticMethod2();
	
	  knif.kgf2();
	  
	  
	  
	  }}