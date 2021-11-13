package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import webutility.Webdriver; 

public class Search extends Webdriver{

	public static void gSrch(String search) throws InterruptedException {
		
		WebElement searchBox=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
        searchBox.sendKeys(search);
        WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
        searchButton.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
		
	}
		
	}


