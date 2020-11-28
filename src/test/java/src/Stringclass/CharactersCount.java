package Stringclass;

public class CharactersCount 
{

	public static void main(String[] args) 
	{
		int count=0;
		String x="hello young man hope you are doing great";
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.print(count+" ");

	}

}
