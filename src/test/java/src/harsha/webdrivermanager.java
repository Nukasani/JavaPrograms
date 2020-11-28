package harsha;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager 
{


	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().arch32().version("80.0.3987.16").setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
