package Sravya;

import java.util.ArrayList;

public class ArralList1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("10");
		names.add("sumanth");
		names.add("krishna");
		names.add("sobha");
		//System.out.println(names.get(1));
		names.set(2,"boddu");
		//System.out.println(names.get(2));
		for( String p:names)
		{
			System.out.println(p);
		}

	}

}
