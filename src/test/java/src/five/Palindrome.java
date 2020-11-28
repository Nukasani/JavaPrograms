package five;

public class Palindrome 
{
	
	public static void main(String[] args) 
	{
		int n=121,sum=0,r;
		int temp=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
