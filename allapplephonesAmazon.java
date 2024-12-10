package webdriverinterfacemethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allapplephonesAmazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.amazon.in/");
		String Url= driver.getCurrentUrl();
		
		if(Url.contains("amazon")) {
			System.out.println("TESTCASE PASS");}
		else {
			System.out.println("TESTCASE FAIL");}
		
		driver.findElement(By.id("hjggg")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys("d");
		List<WebElement> Apple=driver.findElements(By.xpath("//span[contains(text(),'Apple')]"));
		
		for(WebElement a1:Apple) {
	    System.out.println(a1.getText());
		}
		driver.quit();
		
	}
}
