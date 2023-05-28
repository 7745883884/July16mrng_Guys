package Araay_Program;

public class FirstDuplictaElement {
	

	public static void main(String[]args)
	{
	int a[]={6,2,8,4,8,3,7,2};

	int temp=0;
	for(int i=0;i<a.length;i++)     // dont put length-1 otherwise it will miss the last char
	{
	for(int j=i+1;j<a.length;j++)   // dont put i=1, otherwise it will consider himself as a duplicate
	{
	if(a[i]==a[j])
	{
	temp=temp+1;
	System.out.println("first duplicate element=" +a[j]);
	break;
	}
	}
	if(temp>0)
	{
	break; 
	}
	}
	}
	}



