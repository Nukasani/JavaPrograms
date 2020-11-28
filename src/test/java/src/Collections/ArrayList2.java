package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 
{
	public static void main(String[] args) 
	{
		//Arraylist integer type
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.remove(2);
		for(Integer x:al)
		{
			System.out.println(x);
		}
		
		
	}

}
