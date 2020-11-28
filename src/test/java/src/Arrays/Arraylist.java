package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("toyota");
		l.add("mahindra");
		l.add("maruthi");
		l.add("hyundai");
		l.add("bmw");
		
		Collections.sort(l);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(l.get(i));
		}
		
	
	}

}
