package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Arrallist1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(700);
		num.add(100);
		num.add(50);
		num.add(80);
		Collections.sort(num);
		
		for(Integer i:num)
		{
			System.out.println(i);
		}
		
	}

}
