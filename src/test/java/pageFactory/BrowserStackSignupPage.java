package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSignupPage {

	WebDriver driver;
	
	public BrowserStackSignupPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(xpath= "//input[@id='user_full_name']") 
	WebElement name;
	
	@FindBy (xpath="//input[@id='user_email_login']") 
	WebElement email;
	
	@FindBy (id="user_password") 
	WebElement password;
	
	@FindBy (id="tnc_checkbox") 
	WebElement agreeBtn;
	
	@FindBy (xpath="//input[@id='user_submit']") 
	WebElement signUpBtn;
	
	public void enterFullName() {
		name.sendKeys("Hasan");
		}
	public void enterBusinessEmail() {
		email.sendKeys("edghtechnow@gmail.com");
		}
	public void enterPasswrod() {
		password.sendKeys("QaBatch2023");
	}
	
	public void clickOnAgreeBtn() {
		agreeBtn.click();
	}
	
	public void clickOnSignUpBtn() {
		signUpBtn.click();
	}
	
	public BrowserStackSignupPage(){
		PageFactory.initElements( driver, this);
		
	}
}
