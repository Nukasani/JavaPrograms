package harsha;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("kalam");
		File src=driver.switchTo().activeElement().getScreenshotAs(OutputType.FILE);
		File dest=new File("harshaa1.jpg");
		FileHandler.copy(src,dest);
		driver.close();
		
	}

}
