package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptScrollBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		if(driver.getCurrentUrl().equals("https://www.amazon.in/")) 
		System.out.println("TEST CASE PASS TO GIVEN POINTS");
		else
			System.out.println("TEST CASE FAIL TO GIVER POINTS");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)");
		
		driver.quit();
	}
}

