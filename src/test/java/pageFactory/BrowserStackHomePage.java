package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackHomePage {

	WebDriver driver;
	
	public BrowserStackHomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(xpath= "//h1")
	WebElement Header;
	
	@FindBy(xpath= "//a[@id='signupModalButton']") 
	WebElement getStartedBtn;
	
	/*
	 * public void veryHeader() { System.out.println(Header.getText()); }
	 */
	
	public void clickOnGetStartedFreeBtn() {
		getStartedBtn.click();
	}
	
	public BrowserStackHomePage(){
		PageFactory.initElements(driver, this);
	}
}
