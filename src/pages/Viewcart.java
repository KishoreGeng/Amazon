package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import webutility.Webdriver; 

public class Viewcart extends Webdriver{

	public static void viewcrt() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div/div[4]/div/div/div/span[1]/span/span/a")).click();

		Thread.sleep(2000);
		
		WebElement quantity_1 = driver.findElement(By.xpath("(//select[@name='quantity'])[1]"));
		
		new Select(quantity_1).selectByIndex(10);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div/div[2]/div[2]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[1]/span/input")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div/div[2]/div[2]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[1]/span/span[2]/span/span/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div/div[2]/div[2]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")).click();
		
		
	}

}

