package Encapsulation;
class Student
{
	private int rollno;
	private String name;
	
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}	
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setName("harsha");
		s.setRollno(2);
		System.out.println(s.getRollno()+"       "+s.getName());
	}

}
