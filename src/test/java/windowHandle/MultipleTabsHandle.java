package windowHandle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultipleTabsHandle {
	
	
    public static void tabHandle() {
        
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();
        
        // Open the first tab
        driver.get("https://www.google.com");
        
        // Open a new tab
        ((JavascriptExecutor)driver).executeScript("window.open()");
        
        // Get a list of the open tabs
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        
        // Switch to the new tab (index 1)
        driver.switchTo().window(tabs.get(1));
        
        // In the new tab, navigate to another URL
        driver.get("https://www.wikipedia.org");
        
        // Switch back to the first tab (index 0)
        driver.switchTo().window(tabs.get(0));
        
        // Close the driver
        driver.quit();
    }
    
   /* We start by opening the first tab and navigating to google.com.
    We then open a new tab using ((JavascriptExecutor)driver).executeScript("window.open()").
    We switch to the new tab using driver.switchTo().window(tabs.get(1)) and navigate to wikipedia.org.
    Finally, we switch back to the first tab using driver.switchTo().window(tabs.get(0)).*/
}
