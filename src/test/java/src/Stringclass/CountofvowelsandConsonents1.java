package Stringclass;

public class CountofvowelsandConsonents1 
{
	public static void main(String[] args) 
	{
		String x="hello harsha how are u doing";
		int vc=0,cc=0;
		
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
		System.out.println("count of vc"+vc);
		System.out.println("count of cc"+cc);
		

	}

}
