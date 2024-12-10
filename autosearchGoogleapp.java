package webdriverinterfacemethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosearchGoogleapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
       System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("Google")) {
			System.out.println("TESTCASE PASS");
		}else {
			System.out.println("TESTCASE FAIL");
		}
		
		driver.findElement(By.className("gLFyf")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> auto =driver.findElements(By.xpath("//span[text()='java']"));
		
		for (WebElement a1 : auto) {
			System.out.println(a1.getText());
		}
		driver.quit();
		
	}

}
