package Arrays;

public class Arraysmallest 
{

	public static void main(String[] args) 
	{
		int[] array =new int[] {10,20,5,30,};
		int min=50 ;
		
		for( int i=0;i<=3;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("smallest ele    "+min);

	}

}
