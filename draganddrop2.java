package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement block1= driver.findElement(By.id("box1"));
		WebElement block2= driver.findElement(By.id("box101"));
		
		WebElement block3= driver.findElement(By.id("box2"));
		WebElement block4= driver.findElement(By.id("box102"));
		
		WebElement block5= driver.findElement(By.id("box3"));
		WebElement block6= driver.findElement(By.id("box103"));
		
		WebElement block7= driver.findElement(By.id("box4"));
		WebElement block8= driver.findElement(By.id("box104"));
		
		WebElement block9= driver.findElement(By.id("box5"));
		WebElement block10= driver.findElement(By.id("box105"));
		
		WebElement block11= driver.findElement(By.id("box6"));
		WebElement block12= driver.findElement(By.id("box106"));
		
		WebElement block13= driver.findElement(By.id("box7"));
		WebElement block14= driver.findElement(By.id("box107"));
		
		Thread.sleep(5000);
		Actions a1 = new Actions(driver);
	
		a1.dragAndDrop(block1, block2).perform();
		Thread.sleep(5000);
		
		a1.dragAndDrop(block3, block4).perform();
		Thread.sleep(5000);
		
		a1.dragAndDrop(block5, block6).perform();
		Thread.sleep(5000);
		
		a1.dragAndDrop(block7, block8).perform();
		Thread.sleep(5000);
		
		a1.dragAndDrop(block9, block10).perform();
		Thread.sleep(5000);
		
		a1.dragAndDrop(block11, block12).perform();
		Thread.sleep(5000);
		
		a1.dragAndDrop(block13, block14).perform();
		Thread.sleep(5000);
		
		driver.quit();

	}

}