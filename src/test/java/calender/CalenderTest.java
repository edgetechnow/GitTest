package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalenderTest {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Parameters({"URL"})
	@Test
	void login( String baseURL){
		System.out.println(baseURL);
		driver.get(baseURL);
		
		
		driver.findElement(By.xpath("")).click();
		
		while(!driver.findElement(By.xpath("")).getText().contains("match")){
			driver.findElement(By.xpath("")).click();
			
			
		}
		while(driver.findElement(By.xpath("")).getText().contains("match")){
			driver.findElement(By.xpath("")).click();
		}
		
		List<WebElement> dates =driver.findElements(By.className(""));
		
		
		int count = dates.size();
		
		System.out.println(count);
		for(int i =0; i<count;i++){
			String dateText = dates.get(i).getText();
			
			if(dateText.equalsIgnoreCase("30")){
				dates.get(i).click();
				break;
			}
		}
		
		driver.close();
		
	}
	

}
