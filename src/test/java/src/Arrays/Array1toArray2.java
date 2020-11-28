package Arrays;



public class Array1toArray2 
{

	public static void main(String[] args) 
	{
		int[] arra1=new int[] {1,2,3,4,5};
		
		int[] arra2=new int[arra1.length];
		
		for(int i=0;i<arra1.length;i++)
		{
			arra2[i]=arra1[i];
			
		}			System.out.println("elements of original array are:");		
				
		for(int i=0;i<arra1.length;i++)
		{
			System.out.print(arra1[i]);		}
		    System.out.println();
             System.out.println(" elemts of copied array are:");		for(int i=0;i<arra2.length;i++)
		{
			System.out.print(arra2[i]);
		}	

}
}
