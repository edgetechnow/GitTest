package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	protected CartPage(WebDriver driver) {
		this.driver=driver;
	}

	By proceedToCheckOutButton= By.xpath("//a[normalize-space()='Proceed to checkout']");
	
	protected void clickOnProceedToCheckout() {
		driver.findElement(proceedToCheckOutButton).click();
	}
}
