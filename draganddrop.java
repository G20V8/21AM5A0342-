package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement block1= driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block4= driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Thread.sleep(5000);
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(block1, block4);
		Thread.sleep(5000);
		
		driver.quit();

	}

}
