package Araay_Program;

public class MergDiffArray {


	public static void main(String[]args)
	{
	int a[]={10,20,30,40};    
	int b[]={50,60,70,80};
	// merge them in c array
	int u,v,w;
	 u=a.length;   //4
	v=b.length;   // 4
	w=u+v;         //8    but indexing of c start from zero so during merging b element should be set in 3rd position of c[]
	int c[] =new int[w];    // position 
	for(int i=0;i<u;i++)
	{
	    c[i]=a[i];
	}
	for(int i=0;i<v;i++)
	{
	c[u+i]=b[i];
	}

	for(int i=0;i<w; i++)
	{
	System.out.print(c[i] +" ");
	}
	}
	}






