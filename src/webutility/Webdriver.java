package webutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class Webdriver {
	
	public static WebDriver driver;
	
	public static void browserlaunch (String browsername)
	{
		switch (browsername.toLowerCase())
		{
		case "chrome":       
		
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Amazon\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		break;
		
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Amazon\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		break;
		
		default:
			
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Amazon\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			break;
		}
		
	}	
	
	public static void launchapp (String url)
	{
		driver.get(url);
	}
	
	public static void quitbrowser()
	{
		driver.quit();
	}
	
	public static void closebrowser()
	{
		driver.close();
	}
}
