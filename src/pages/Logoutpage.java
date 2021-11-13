package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import webutility.Webdriver; 

public class Logoutpage extends Webdriver {

	public static void Logt () throws InterruptedException {
		
		Actions a= new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("(//a[@id='nav-link-accountList']//span)[2]"));
        a.moveToElement(ele).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-item-signout']//span[1]")).click();
        driver.quit();
	}

}
