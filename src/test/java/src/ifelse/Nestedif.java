package ifelse;

import java.util.Scanner;

public class Nestedif 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("eneter your weight");
		int weight=sc.nextInt();
		System.out.println("eneter your height");
		int height=sc.nextInt();
		
		
		
		if(age>=25)
		{
			if(weight>=80)
			{
				if(height>=5)
				{
					System.out.println("your eligile to donate  blood");
				}
				else 
				{
					System.out.println("you r nor eligible");
				}
			}
		}
		
	}

}
