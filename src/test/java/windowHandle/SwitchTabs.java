package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SwitchTabs {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();
        
        // Open the first tab
        driver.get("https://www.google.com");
        
       
        
        // Wait for the "Gmail" link to be clickable
        new WebDriverWait(driver, Duration.ofSeconds(100));
        	//.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));

        // Open the second tab
        String selectLinkOpenInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN); 
        driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpenInNewTab);
        
        // Switch to the second tab
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Perform actions on the second tab
        // new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();

        // Switch back to the first tab
        driver.switchTo().window(tabs.get(0));

        // Perform actions on the first tab
        // new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.name("q"))).sendKeys("OpenAI");
        // new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.name("q"))).submit();

        // Close the browser
        driver.quit();
    }
}
