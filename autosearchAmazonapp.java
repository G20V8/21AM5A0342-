package webdriverinterfacemethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosearchAmazonapp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("Online Shopping site")) {
			System.out.println("TESTCASE PASS");
		}else {
			System.out.println("TESTCASE FAIL");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> Search=driver.findElements(By.xpath("//div[text()='iphone']"));
		for (WebElement a1 : Search) {
			System.out.println(a1.getText());
		}
		Thread.sleep(2000);
          driver.close();
	}

}
