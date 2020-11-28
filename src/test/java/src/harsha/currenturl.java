package harsha;

import org.openqa.selenium.chrome.ChromeDriver;

public class currenturl 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		String x=driver.getCurrentUrl();
		String s=driver.getTitle();
		System.out.println(x+""+s);
		driver.quit();

	}

}
