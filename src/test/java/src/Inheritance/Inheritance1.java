package Inheritance;

class CalAdd
{
	public int add(int i,int j)
	{
		return(i+j);
	}
}
class  Calsub //extends CalAdd
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}


public class Inheritance1 
{
	public static void main(String[] args) 
	{
		CalAdd ad=new CalAdd();
		System.out.println(ad.add(5, 5)); 

	}

}
