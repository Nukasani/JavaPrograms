package Stringclass;

public class Stringreverse 
{

	public static void main(String[] args) 
	{
		String x="harsha";
		String y="";
		
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		System.out.println(y);

	}

}
