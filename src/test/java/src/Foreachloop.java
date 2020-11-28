
public class Foreachloop 
{
	public static void main(String[] args) 
	{

		String[] name= {"harsha","sahithi","balaji","sudha"};
		
		name[1]="N sahithi";		
		for(String i:name)		
		{
			System.out.print(i);
		}
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		

	}

}
