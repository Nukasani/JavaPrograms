package harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsmovemousepointer
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Trending']"));
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}

}
