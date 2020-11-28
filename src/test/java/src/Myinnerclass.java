class Outerclass
{
	int x=5;
	class Innerclass
	{
		int y=10;
	}
	
}
public class Myinnerclass 
{

	public static void main(String[] args) 
	{
		Outerclass obj=new Outerclass();
		Outerclass.Innerclass obj1=obj.new Innerclass();
		System.out.println(obj.x+obj1.y);
	}

}
