package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	protected HomePage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	By storeMenu=By.cssSelector("li[id='menu-item-1227'] a");
	By shirt=By.cssSelector("li[id='menu-item-1227'] a");
	By pants=By.cssSelector("li[id='menu-item-1227'] a");
	By shoes=By.cssSelector("li[id='menu-item-1227'] a");
	By shavingCream=By.cssSelector("li[id='menu-item-1227'] a");
	
	
	public StorePage clickOnStoreMenu() {
		
		driver.findElement(storeMenu).click();
		
		return new StorePage(driver);
	}
		
		

}

