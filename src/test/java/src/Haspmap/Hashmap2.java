package Haspmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap2
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "harsha");
		hm.put(4,"balaji");
		hm.put(2,"sudha");
		hm.put(3,"sahithi");
		//hm.remove(3);
		
		for(Integer l:hm.keySet())
		{
			System.out.println(l);
		}

	}

}
