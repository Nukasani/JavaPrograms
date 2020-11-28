package harsha;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigateto 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//close site
		driver.close();

	}

}
