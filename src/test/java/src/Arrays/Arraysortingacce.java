package Arrays;

public class Arraysortingacce 
{

	public static void main(String[] args) 
	{
		int temp=0;
		
		int[] arr =new int[] {1,3,5,7,2,4,6,8,10,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;  
				}
				
				
			}
			System.out.print(arr[i]+" ");
		}
	

		
		

	}

}
