package webdriverinterfacemethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Child { public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.hyrtutorials.com/");
	Actions a1 = new Actions(driver);
	WebElement selenium = driver.findElement(By.xpath("(//a[contains(text(),'Selenium ')])[2]"));
	a1.moveToElement(selenium).perform();
	WebElement window = driver.findElement(By.xpath("//a[contains(text(),'Window ')]"));
	a1.click(window).perform();
	
	String parent=driver.getWindowHandle();

	
	driver.findElement(By.id("newWindowBtn")).click();
	
	Set<String> parentchild=driver.getWindowHandles();
	for(String s1:parentchild) {
		if(!s1.equals(parent)) {
			driver.switchTo().window(s1);
			Thread.sleep(2000);
			driver.findElement(By.id("firstName")).sendKeys("nene");
			Thread.sleep(2000);
			driver.findElement(By.id("lastName")).sendKeys("kannak");
			Thread.sleep(2000);
			driver.findElement(By.id("malerb")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("hindichbx")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("narendrda123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("1235gty");
			Thread.sleep(2000);
			driver.findElement(By.id("registerbtn")).click();
			Thread.sleep(2000);
			WebElement Registration = driver.findElement(By.xpath("//label[text()='Registration is Successful']"));
			System.out.println(Registration.getText());
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(2000);
	
	
	driver.switchTo().window(parent);
	
	driver.findElement(By.id("newTabBtn")).click();
	Thread.sleep(2000);}}
	driver.close();
	
	
	
	
	
	
}

}