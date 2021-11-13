package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import webutility.Webdriver; 

public class Loginpage extends Webdriver{

	public static void Login(String phno, String pass) throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//a[@id='nav-link-accountList']//span)[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys(phno);
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);

	}

}
