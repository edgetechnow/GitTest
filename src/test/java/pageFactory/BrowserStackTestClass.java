package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BrowserStackTestClass {
	WebDriver driver;
	
	

	
	@Test
	public void bowserStackPagefactorytest()  throws InterruptedException {
		
		

		BrowserStackHomePage browserHp= new BrowserStackHomePage(driver);
		
		BrowserStackSignupPage browserStackSignupPg = new BrowserStackSignupPage(driver);
		driver= new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//	browserHp.veryHeader();
		
		
		browserHp.clickOnGetStartedFreeBtn();
		
		browserStackSignupPg.enterFullName();
		browserStackSignupPg.enterBusinessEmail();
		browserStackSignupPg.enterPasswrod();
		browserStackSignupPg.clickOnAgreeBtn();
		browserStackSignupPg.clickOnSignUpBtn();
		
	}
	
	public BrowserStackTestClass(){
		PageFactory.initElements( driver, this);
		
	}
}
