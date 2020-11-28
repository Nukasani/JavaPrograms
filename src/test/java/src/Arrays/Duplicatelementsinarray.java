package Arrays;

public class Duplicatelementsinarray 
{

	public static void main(String[] args) 
	{
		int array[] ={1,2,3,4,5,7,10,1,2,3,7,8,9};
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
