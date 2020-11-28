package Stringclass;

import java.util.HashMap;
import java.util.Set;


public class DuplicatewordsinString1 
{
	public static void main(String[] args) 
	{
		String x="hi harsha hello harsha Hi hello hi";
		String x1=x.toLowerCase();
		String[] x2=x1.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String x3:x2)
		{
			if(hm.containsKey(x3))
			{
				hm.put(x3,hm.get(x3)+1);
			}
			else
			{
				hm.put(x3, 1);
			}
			
		} 
		
		Set<String> x4=hm.keySet();
		for(String x5:x4)
		{
			if(hm.get(x5)>1)
			{
				System.out.println(x5+":"+hm.get(x5));
			}
		}

	}

}
