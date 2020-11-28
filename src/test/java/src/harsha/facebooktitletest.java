package harsha;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktitletest 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		String x=driver.getTitle();
		System.out.println(x);
		if(x.contains("Facebook"))
		{
			System.out.println("facebook title test passed");
			
		}
		else
		{
			System.out.println("facebook title test failed");
		}
		driver.close();
	}

}
