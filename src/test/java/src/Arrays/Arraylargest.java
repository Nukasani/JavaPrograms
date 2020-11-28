package Arrays;

public class Arraylargest 
{

	public static void main(String[] args) 
	{
		int[] array =new int[] {10,30,20,40};
		int max=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		System.out.println(" largest ele is     "+max);

	}

}
