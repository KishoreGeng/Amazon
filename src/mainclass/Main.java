package mainclass;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import webutility.Webdriver;

import org.junit.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Addcart;
import pages.Loginpage;
import pages.Logoutpage;
import pages.Search;
import pages.Viewcart;

public class Main extends Webdriver{

	@BeforeTest
	//public static void main(String[] args) throws InterruptedException {
	@Test(priority=0)
		public void A () {
		Webdriver.browserlaunch("chrome");
		Webdriver.launchapp("https://www.amazon.in");
		System.out.println("Browser Launch Successfully");
		}
	@Test(priority=1)
	public void B() throws InterruptedException {
		pages.Loginpage.Login("8825935129", "Smart@123");
		System.out.println("Login Successfully Done");
	}
	
	@Test(priority=2)
	public void C() throws InterruptedException {
		pages.Search.gSrch("macbook pro Laptop");
		System.out.println("Serach Completed");
	}
	
	@Test(priority=3)
	public void D() throws InterruptedException {
	pages.Addcart.adcrt();
	System.out.println("Add to Cart Succesfully Done");
	}
	
	
	@Test(priority=4)
	public void E() throws InterruptedException {
		pages.Viewcart.viewcrt();
		System.out.println("Cart viewed Succesfully");
	}
	
	
	@Test(priority=5)
	public void F() throws InterruptedException {
		Thread.sleep(2000);
		pages.Logoutpage.Logt();
		System.out.println("Logout Done Successfully");
		driver.quit();

	}
	
}

