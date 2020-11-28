package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap1 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("harsha", 1);
		map.put("sahithi",2);
		map.put("sudha", 3);
		map.put("madhuri",4);
		map.put("harsha",5);
		Set<String> st=map.keySet();
		
		for( String x:st)
		{
			System.out.println(x+" "+map.get(x));
		}
	}

}
