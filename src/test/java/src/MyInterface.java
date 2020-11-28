interface Class
{
	void dog();
	void pig();
}
class Animal implements Class
{
	public void dog()
	{
		System.out.println("dog says bow bow");
	}
	public void pig()
	{
		System.out.println("pig says wee wee");
	}
	
}
public class MyInterface 
{

	public static void main(String[] args) 
	{
		Animal obj =new Animal();
		obj.dog();
		obj.pig();
	}
}
