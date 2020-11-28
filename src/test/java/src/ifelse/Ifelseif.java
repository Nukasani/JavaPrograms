package ifelse;

import java.util.Scanner;

public class Ifelseif 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		
		if(marks<20)
		{
			System.out.println("fail");
		}
		else if( marks>35 && marks<35)
		{
			System.out.println("fail");
		}
		else if(marks==35 && marks<35)
		{
			System.out.println("pass");
		}
		else if(marks>50 && marks<60)
		{
			System.out.println("above pass");
		}
		else if(marks>61 && marks<70)
		{
			System.out.println("first class");
		}
		else if(marks>71 && marks<99)
		{
			System.out.println("marvelous");
		}
		else if(marks>=100 && marks<1000)
		{
			System.out.println("no need studies");
		}
		else 
		{
			System.out.println("above all");
		}

		

	}

}
