package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolltoelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//a[contains(text(),'Terms Of Use')]"));
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.scrollToElement(search).perform();

	}

}
