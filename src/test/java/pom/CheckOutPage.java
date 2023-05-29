package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	WebDriver driver;
	protected CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}

	By firstName=By.id("billing_first_name");
	By lastName = By.id("billing_last_name");
	By address= By.id("billing_address_1");
	By city= By.id("billing_city");
	
	By zipcode= By.id("billing_postcode");
	By email= By.id("billing_email");
	By placeOrder= By.id("place_order");
	By orderMessage= By.xpath("//p[contains(text(),'Thank you.')]");
	protected void enterFirstname() {
		driver.findElement(firstName).sendKeys("Hasan");
	}
	
	protected void enterLastname() {
		driver.findElement(lastName).sendKeys("M");
	}
	protected void enterAddress() {
		driver.findElement(address).sendKeys("245");
	}
	protected void enterCity() {
		driver.findElement(city).sendKeys("California");
	}
	protected void enterZipCode() {
		driver.findElement(zipcode).sendKeys("10000");
	}
	protected void enterEmail() {
		driver.findElement(email).sendKeys("abc@gmail.com");
	}
	protected void clickPlaceOrder() throws InterruptedException {
		
		driver.findElement(email).click();
	}
	
	protected void orderReceivedMessage() throws InterruptedException {
		Thread.sleep(3000);
		String textCheckoutMessage=driver.findElement(orderMessage).getText();
		
		System.out.println(textCheckoutMessage);
	}
	
}
