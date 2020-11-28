package harsha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countoflinksinpage
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		//System.out.println(l.size());
		int links=0;
		int i;
		for(i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				links=links+1;
			}
			
		}
		System.out.println("total count of links" +l.size());

	}

}
