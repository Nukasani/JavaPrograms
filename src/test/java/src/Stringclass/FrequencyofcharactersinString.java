package Stringclass;

public class FrequencyofcharactersinString 
{

	public static void main(String[] args) 
	{
		//frequency of Characters in String
		String x="Nukasanisriharshyadav";
		String x1=x.toLowerCase();
		char[] x2=x1.toCharArray();
		
		int[] freq =new int[x2.length];
		
		int i,j;
		
		for(i=0;i<x2.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<x2.length;j++)
			{
				if(x2[i]==x2[j])
				{
					freq[i]++;
				}
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(x2[i]!=' ' && x2[i]!='0')
			{
				System.out.println(x2[i]+"---- "+freq[i]);
			}
		}
		
		
		
		
		

	}

}
