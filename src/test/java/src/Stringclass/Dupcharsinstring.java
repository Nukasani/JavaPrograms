package Stringclass;

public class Dupcharsinstring 
{

	public static void main(String[] args) 
	{
		String x="harsha is a good boy not girl";
	
		int i,j;
	for(i=0;i<x.length();i++)
	{
		char a=x.charAt(i);
		for(j=i+1;j<x.length();j++)
		{
			char b=x.charAt(j);
			if(a==b)
			{
		
				System.out.print(b);
			}
		}
	}
		
		
		
		

	}
}
