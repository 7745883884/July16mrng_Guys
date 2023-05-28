package constructor_uses;

public class ConstructorUsage {
	int i;
	String s;
	boolean b;
	public ConstructorUsage(int u , String v, boolean g)
	{
	i= u;
	s= v;
	b= g;
	}
	public static void main(String[] args) {
	ConstructorUsage cu = new ConstructorUsage(50,"abc", true);
	ConstructorUsage cu1 = new ConstructorUsage(60,"def", false);
	}}
