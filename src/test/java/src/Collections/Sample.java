package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample 
{
	public static void main(String[] args) 
	{
	 String x="java is best lanuage java";
	 String[] x1=x.split(" ");
	 
	 Map<String,Integer> hm=new HashMap<String,Integer>();
	 for(String x2:x1)
	 {
		 if(hm.containsKey(x2))
		 {
			 hm.put(x2,hm.get(x2)+1);
		 }
		 else
		 {
			 hm.put(x2,1);
		 }
	 }
	 
	 Set<String> x3=hm.keySet();
	 for( String x4:x3) 
	 {
		 System.out.println(x4+"  "+hm.get(x4));
	 }

	}
}
