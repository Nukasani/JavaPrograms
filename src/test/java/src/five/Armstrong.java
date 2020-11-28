package five;

public class Armstrong {

	public static void main(String[] args) {
		int a,c=0,b=153,temp;
		temp=b;
		
		while(b>0)
		{
			a=b%10;
			b=b/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		

	}

}
