package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		WebElement s =driver.findElement(By.id("sb_form_q"));
		s.sendKeys("vishwas");
		Thread.sleep(2000);
		s.clear();
		Thread.sleep(3000);
		s.sendKeys("reddy");
		s.clear();
		Thread.sleep(3000);
		s.sendKeys("cat");
		s.clear();
		driver.close();
	}
	

}
