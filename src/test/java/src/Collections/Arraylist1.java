package Collections;

import java.util.ArrayList;

public class Arraylist1 
{
	public static void main(String[] args) 
	{
		//ArratyList String type  
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("harsha");
		al.add("ramu");
		al.add("sita");
		al.add("Somu");
		al.add("giri");
		System.out.println(al.get(2));
		for(String x:al)
		{
			System.out.println(x);
		}

	}

}
