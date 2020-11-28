package harsha1;

public class PerfectBox 
{

	public static void main(String[] args) 
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==0||j==0||i==0||j==1||i==0||j==2||i==0||j==3|i==0||j==4)
				{
					System.out.print("#");
				}
				System.out.println();
			}
		}

	}

}
