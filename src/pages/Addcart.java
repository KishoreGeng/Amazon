
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import webutility.Webdriver; 

public class Addcart extends Webdriver{

	public static void adcrt() throws InterruptedException {
		
		Thread.sleep(2000);
		for(String handle: driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			}
		WebElement quantity = driver.findElement(By.xpath("(//select[@name='quantity'])[1]"));
		new Select(quantity).selectByIndex(1);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
	
	}

		
	}


