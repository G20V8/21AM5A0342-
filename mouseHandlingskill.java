package webdriverinterfacemethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class mouseHandlingskill {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		Actions a1 = new Actions(driver);
		
		WebElement r = driver.findElement(By.id("course"));
		a1.moveToElement(r).perform();
		
		WebElement r1 = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));
		a1.click(r1).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);    
		System.out.println(temp);                         
		File per = new File("./sample/skill.png");             
		FileHandler.copy(temp, per);
		
		if(driver.getCurrentUrl().equals("https://demoapp.skillrary.com/product.php?product=selenium"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.navigate().refresh();
		driver.navigate().back();
		
		WebElement r2 = driver.findElement(By.id("course"));
		a1.moveToElement(r2).perform();
		Thread.sleep(3000);
		WebElement r3 = driver.findElement(By.xpath("(//a[contains(text(),'Java')])[2]"));
		a1.click(r3).perform();
		
		
		for(int i=1;i<=3;i++) {
		WebElement r4 = driver.findElement(By.id("add"));
		a1.doubleClick(r4).perform();
		
		}
		if(driver.getCurrentUrl().equals("https://demoapp.skillrary.com/product.php?product=java"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.quit();
	}

}
