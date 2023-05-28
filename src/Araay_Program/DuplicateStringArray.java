package Araay_Program;

public class DuplicateStringArray {   //https://www.youtube.com/results?search_query=array+program+in+java

	public static void main(String[]args)
	{
		boolean flag = false;
		String a[]= {"lokesh","shiva","raje","kumar","lokesh","nilu","dhoni","kumar","kumar"};
		System.out.println(a.length);   // one world consider 1 length total =9
		
		for(int i=0;i<a.length;i++)
		{
			for(int j= i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("dublicate element is ="+a[i]);
				flag= true;
				}
			}
		
		if(flag==false)
		{
			System.out.println("dublicate element is Not found");
		}
	}
}  
}
