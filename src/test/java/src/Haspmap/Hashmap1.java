package Haspmap;

import java.util.HashMap;

public class Hashmap1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "harsha");
		hm.put(4,"balaji");
		hm.put(2,"sudha");
		hm.put(3,"sahithi");
		//hm.remove(3);
		
		for(String l:hm.values())
		{
			System.out.println(l);
		}
	}

}
