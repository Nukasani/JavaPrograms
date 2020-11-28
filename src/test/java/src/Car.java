
public class Car 
{
	void fullThrottle()
	{
		System.out.println("car is in full throttle");
	}
	
	void fullSpeed(int speed)
	{
		System.out.println("car is in full speed        " +speed);
	}

	public static void main(String[] args) 
	
	{
		Car obj=new Car();
		obj.fullSpeed(   2000);
		obj.fullThrottle();
	}

}
