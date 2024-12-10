package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expilicitywait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement email=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("Admin123");
		
		WebElement pass=driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("Admin@123");
		
		WebElement login=driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		

	}

}
