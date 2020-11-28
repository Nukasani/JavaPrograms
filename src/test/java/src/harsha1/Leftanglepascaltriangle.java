package harsha1;

public class Leftanglepascaltriangle 
{

	public static void main(String[] args) 
	{
		
		/*
		  
   **
  ***
 ****
*****
 ****
  ***
   **
    *
		 */
		int i,j,k,l,m,n;
		
		for(i=1;i<=5;i++)
		{
			for(j=5-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				for(l=1;l<=4;l++)
		{
						for(m=1;m<=l;m++)
			{
				System.out.print(" ");
			}
			for(n=4;n>=l;n--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
