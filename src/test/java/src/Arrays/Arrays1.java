package Arrays;

public class Arrays1 
{

	public static void main(String[] args) 
	{
		String[][] names= {
								{"harsha","sahithi","balaji","sudha"},
								{"nukasani","none","nukasani","sayala"}
					};
		
		//for loop
		
		/*for( int i=0;i<names.length;i++)
		{
			for(int j=0;j<names[i].length;j++)
			{
				System.out.println(names[i][j]);
				
			}	
		}*/
		
		//for each loop(advanced)
		for( String n[]:names)
		{
			for(String k:n)
			{
				System.out.println(k);
			}
		}
}
	}

