package alertHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertHandle {
	
	
	@Test
	
	void alert() 
	{
        
       // System.setProperty("webdriver.chrome.driver","path_to_chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice");  // Navigate to your webpage
        
    

        try {
            // Wait until the alert is present
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
            
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Accept or dismiss the alert
            alert.accept();  // or alert.dismiss();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
