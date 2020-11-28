package harsha;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class divtagdropdwn {

	public static void main(String[] args)  throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//div[@class='ui selection dropdown'])[1]"));
		String x=e.getAttribute("class");
		if(x.contains("mutiple"))
		{
			System.out.println("mutiselect dropdown");
		}
		else
		{
			System.out.println("single select dropdown");
		}
		Actions a=new Actions(driver);
		a.click(e).perform();
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='ui selection dropdown active visible']"));
		System.out.println("no.of items in drop down"  +l.size());
		Duration d=Duration.ofSeconds(5);
				a.pause(d).perform();
	}

}
