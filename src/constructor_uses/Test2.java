package constructor_uses;

public class Test2 {
	//	Calling of one constructor inside another constructor
		public Test2()
		{
		System.out.println("zero argument constructor");
		}
		public Test2(String s)
		{
		this();
		System.out.println("One argument constructor");
		}
		public Test2(boolean b, int c)
		{ this("Velocity");
		System.out.println("Two argument constructor");
		}
		public static void main(String[] args) {
		Test2 t2 = new Test2(true, 50);

		}}
