package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	
	//First create browser url variable
	
	String url = "https://www.zara.com/us/";
	String email = "mhasan@abc.com";
	String pass = "123456";
	
	WebDriver driver ;
	
	@Test
	void openBrowser() throws InterruptedException{
		//open the browser here 
		driver = new ChromeDriver();
		driver.get(url);//we will go to the url
		
		
		//we will signin in to zara account
		driver.manage().window().maximize();//this method will make the browser take max screen 
		driver.findElement(By.xpath("//span[normalize-space()='LOG IN']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='logonId']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		
		//click on login button
		driver.findElement(By.xpath("//span[normalize-space()='LOG IN']")).click();
		
		//System.out.println(driver.getCurrentUrl());//it will display current url
		
		Thread.sleep(4000);// to get extra time
		driver.close();
		
		
	}
	


	
	
	

}
