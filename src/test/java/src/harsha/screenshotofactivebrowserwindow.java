package harsha;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotofactivebrowserwindow 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver1 =new ChromeDriver();
		driver1.get("https://www.youtube.com/");
		Thread.sleep(3000);
		File src= driver1.getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot1.jpg");
		FileHandler.copy(src,dest);
		driver1.quit();
		
		
		
	}

}
