package Encapsulation;
class Tset
{

	private String name;
	
	
	public String getname()
	{
		return name;
	}
	public void setname(String name) 
	{
		this.name=name;
	}
}
public class Encapsulation1 
{	
	public static void main(String[] args) 
	{
		
		Tset obj=new Tset();
		obj.setname("harsha");
		System.out.println(obj.getname());
		

	}

}
