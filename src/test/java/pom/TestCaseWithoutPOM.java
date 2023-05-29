package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutPOM {
	
	WebDriver driver=null;
	
	@Test
	public void testingWithouPOM() throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://askomdch.com/");
		
		driver.manage().window().maximize();
		
		HomePage homePage= new HomePage(driver);
		StorePage storePage= homePage.clickOnStoreMenu();
		 
	//	 StorePage storePage= new StorePage(driver);
		 storePage.search();
		 storePage.clickOnSearch();
		 storePage.clickOnAddToCart();
		 storePage.clickOnViewCart();
		
		 CartPage cartPage= new CartPage(driver);
		 
		 cartPage.clickOnProceedToCheckout();
		 
		 CheckOutPage checkOutpage= new CheckOutPage(driver);
		 
		 checkOutpage.enterFirstname();
		 checkOutpage.enterLastname();
		 checkOutpage.enterAddress();
		 checkOutpage.enterCity();
		 checkOutpage.enterZipCode();
		 checkOutpage.enterEmail();
		 checkOutpage.clickPlaceOrder();
	//	 checkOutpage.orderReceivedMessage();
		 
		 
		//driver.findElement(By.cssSelector("li[id='menu-item-1227'] a")).click();
		
		//driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("blue");
		
	//	driver.findElement(By.cssSelector("button[value='Search']")).click();
		
	//	driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
		
	//	Thread.sleep(2000);
	//	driver.findElement(By.cssSelector("a[title='View cart']")).click();
		
	//	driver.findElement(By.xpath("//a[normalize-space()='Proceed to checkout']")).click();
		
	/*	driver.findElement(By.id("billing_first_name")).sendKeys("Hasan");
		driver.findElement(By.id("billing_last_name")).sendKeys("M");
		driver.findElement(By.id("billing_address_1")).sendKeys("245");
		driver.findElement(By.id("billing_city")).sendKeys("California");
		
		driver.findElement(By.id("billing_postcode")).sendKeys("10000");
		driver.findElement(By.id("billing_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("place_order")).click(); */
		
	//	Thread.sleep(4000);
		
	//	String textCheckoutMessage=driver.findElement(By.xpath("//p[normalize-space()='Thank you. Your order has been received.']")).getText();
		
	//	System.out.println(textCheckoutMessage);
		
		
	}

}
