package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptScrollintoView {

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
		Thread.sleep(2000);
		WebElement az = driver.findElement(By.xpath("//span[contains(@class,'navFooterBackToTopText')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",az);
		Thread.sleep(2000);
		driver.quit();
	}
}

