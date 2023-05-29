import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class regTest {
	
	WebDriver  driver = new ChromeDriver();
	
	
	@Test
	public void browserOpen() throws InterruptedException{
		driver.get("https://www.browserstack.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//a[@id='signupModalButton']")).getText());
		
		driver.findElement(By.xpath("//a[@id='signupModalButton']")).click();
		driver.close();
		
	}
	
	

}
