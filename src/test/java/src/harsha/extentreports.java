package harsha;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreports 
{
	public static void main(String[] args) throws Exception
	{ 
		ExtentReports er=new ExtentReports("C:\\Harsha\\harsha.html",false);
		ExtentTest et=er.startTest("Gmail title test");
	//open browser
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//launch site
		driver.get("https://www.gmail.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.name("identifier")));
		String x=driver.getTitle();
		if(x.contains("gmail"))
		{
			et.log(LogStatus.PASS,"gmail title test passed");
		}
		else
		{
			SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
			Date d=new Date();
			String fname=sf.format(d)+".png";
			File src= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
			File dest=new File(fname);
			FileHandler.copy(src,dest);
			et.log(LogStatus.FAIL,et.addScreenCapture(fname)+"gmail title test failed");
		}
		//close site
			driver.close();
		//save and close 
			er.endTest(et);
			er.flush();
			
			
			
		
		
		
		
		
		
	}

}
