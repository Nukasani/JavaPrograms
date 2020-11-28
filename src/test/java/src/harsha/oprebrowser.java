package harsha;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oprebrowser 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String x=sc.nextLine();
		WebDriver driver;
		
		if(x.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(x.contains("opera"))
		{
			
			
			
		}
		
	}

}
