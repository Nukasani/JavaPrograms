package ifelse;

import java.util.Scanner;

public class Ifelse 
{

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your number");
		int x=sc.nextInt();
		
		if(x>=0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
	}

}
