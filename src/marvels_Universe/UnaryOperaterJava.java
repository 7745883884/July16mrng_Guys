package marvels_Universe;

public class UnaryOperaterJava {
// Expression=Variable
	public static void main(String[]args) {
	int a=100;// ++ means add +1 & -- means subtract -1.
	System.out.println(a);//100
	System.out.println(a++);//100 (100+1=101) initially system read only 'a' but then he got ++ so he added '+1' in output.
	System.out.println(a);// 101
	System.out.println(a++);//101 (101+1=102)
	System.out.println(a++);//102(102+1=103).// post operation = operation done (103)for next operation,
	int b=50;	
    System.out.println(b);// 50
    System.out.println(b--);//50(50-1=49)
    System.out.println(b--);//49(49-1=48)
    System.out.println(b);//48
    System.out.println(b--);//48(48-1=47)
    System.out.println(b--);//47
    int c=200;
	System.out.println(++c);//201(1+200=201).
	System.out.println(c); //201
	System.out.println(++c);//202(1+201=202)
	System.out.println(++c);//203
	System.out.println(c);//203
	System.out.println(++c);//204 
	
	int e=15;
	System.out.println(+e);
	System.out.println(+e);
	System.out.println(+e);
	System.out.println(+e);
	System.out.println(+e);
	System.out.println(+e);
	 
	int f= 215;
	System.out.println(-f);
	System.out.println(-f);
	System.out.println(-f);
	System.out.println(f);
	System.out.println(-f);
	System.out.println(f);
	
	int g=  -45;//   "~" round of Operator  technical language{bitwise complement}
	System.out.println(~g);//   -(-45+1)=44                  // this is called flipping operation //flipping... -[n+1]
	System.out.println(g); // -(44+1)=-45 
	System.out.println(~g);// -(-45+1)=44
	System.out.println(~g);//-(-45+1)=44
	System.out.println(~g);//-(-45+1)=44

	boolean h=50>5; //!h =not h , it will give just reverse conditional information
	System.out.println(h);//
	System.out.println(!h);//
	System.out.println(!h);//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}