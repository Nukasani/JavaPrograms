import java.util.Scanner;

public class Evenum 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your num");
		int x=sc.nextInt();
		for(int i=0;i<=x;i=i+2)
		{
			System.out.print(" "+i);
		}
		
		

	}

}
