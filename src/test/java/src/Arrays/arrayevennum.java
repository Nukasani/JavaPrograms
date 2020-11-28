package Arrays;

import java.util.Scanner;

public class arrayevennum 
{
	public static void main(String[] args) 
	{
//		Scanner sc =new Scanner(System.in);
//		System.out.println("eneter numbers");
//		int x=sc.nextInt();
//		
		int[] array=new int[] {2,2,3,4,5,6,7,8,12,15};
		int[] x=array;
	
		
		for(int i = 1; i < array.length; i = i+2)
		{
			System.out.println(array[i]);
			
		}

	}

}
