package Collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset1 
{
	public static void main(String[] args) 
	{
		//duplicates are not allowed in set
		
		Set<String> set=new HashSet<String>();
		set.add("harsha");
		set.add("sahithi");
		set.add("harsha");
		for(String x:set)
		{
			System.out.println(x);
		}
		

	}

}
