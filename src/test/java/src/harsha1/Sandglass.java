package harsha1;

public class Sandglass 
{

	public static void main(String[] args) 
	{
int i,j,k;
		
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=6;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
			for(i=1;i<=6;i++)
			{
				for(j=6-i;j>=1;j--)
				{
					System.out.print(" ");
				}
				for(k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
				
		

	}

}
