package Stringclass;

public class CountofvowelsandConsonents 
{

	public static void main(String[] args) 
	{
		int i,vowels=0,consonents=0;
		String x="hello harsha have a good";
		  x=x.toLowerCase();
		
		for(i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='a' ||x.charAt(i)=='e' ||x.charAt(i)=='i' ||x.charAt(i)=='o' ||x.charAt(i)=='u' )
			{
				vowels++;
				
			}
			else if(x.charAt(i) >= 'a' && x.charAt(i)<='z')
			{
				consonents++;
			}
			
		}
		System.out.println(vowels);
		System.out.println(consonents);

	}

}
