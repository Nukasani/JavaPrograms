package Methods;

public class NonStaticMethods 
{
	void method1()
	{
		System.out.println("this is method 1");
	}
	void method2(String name)
	{
		System.out.println("this is method 2   "+name);
	}

	public static void main(String[] args)
	{
	 NonStaticMethods obj=new NonStaticMethods();
	 obj.method1();
	 NonStaticMethods obj1=new NonStaticMethods();
	 obj1.method2("harsha");

	}

}
