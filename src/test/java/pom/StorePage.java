package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage {

	WebDriver driver;
	
	By search=  By.id("woocommerce-product-search-field-0");
	By clickOnSearchButton= By.cssSelector("button[value='Search']");
	By clickAddToCartButton= By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
	
	By clickOnViewCart= By.cssSelector("a[title='View cart']");
	
	protected StorePage(WebDriver driver) {
		  this.driver=driver;
	  }
	 
	
	  
	  public void search() {
		  driver.findElement(search).sendKeys("blue");
	  }

	  public void clickOnSearch() {
		  driver.findElement(clickOnSearchButton).click();
	  }
		
	 public void clickOnAddToCart() {
		 driver.findElement(clickAddToCartButton).click();
	 }	
	
	public void clickOnViewCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(clickOnViewCart).click();
	//	return new CartPage(driver);
	}
}
