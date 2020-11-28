package harsha;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriver 
{

	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.co.in/");
		String x=driver.getTitle();
		System.out.println(x);
		if(x.contains("Google"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		
		
		
	}

}
