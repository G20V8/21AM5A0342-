package webdriverinterfacemethods;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childwindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parent=driver.getWindowHandle();
		driver.get("https://www.hyrtutorials.com/");
		
		Actions a1 = new Actions(driver);
		WebElement selenium = driver.findElement(By.xpath("(//a[contains(text(),'Selenium ')])[2]"));
		a1.moveToElement(selenium).perform();
		
		WebElement window = driver.findElement(By.xpath("//a[contains(text(),'Window ')]"));
		a1.click(window).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> parentchild=driver.getWindowHandles();
		for(String s1:parentchild) {
			if(!s1.equals(parent)) {
				driver.switchTo().window(s1);
		WebElement alertbox=driver.findElement(By.id("alertBox"));
		alertbox.click();
		
		Thread.sleep(2000);
		Alert SINGLE=driver.switchTo().alert();
	System.out.println(SINGLE.getText());
	SINGLE.accept();
	
	Thread.sleep(2000);
	WebElement alert =driver.findElement(By.id("confirmBox"));
	alert.click();
	Thread.sleep(2000);
	Alert conform =driver.switchTo().alert();
	
	System.out.println(conform.getText());
	conform.accept();
	Thread.sleep(2000);
	WebElement alert1 =driver.findElement(By.id("promptBox"));
	alert1.click();
	Thread.sleep(2000);
	Alert promt=driver.switchTo().alert();
	System.out.println(promt.getText());
	promt.sendKeys("vishwas");
	promt.accept();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(parent);
	
			
		WebElement kanna = driver.findElement(By.id("name"));
		kanna.sendKeys("vishwas");
		
		Thread.sleep(2000);
	
		
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
			}}
		driver.quit();
		
		
	}

}