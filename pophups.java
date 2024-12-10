package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pophups {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver =  new ChromeDriver();	
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.hyrtutorials.com/");
        
        Actions a1 = new Actions(driver);
		
		WebElement r = driver.findElement(By.xpath("//a[contains(text(),'Selenium Practice')]"));
		a1.moveToElement(r).perform();
		
		WebElement r1 = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
		a1.click(r1).perform();
		
		WebElement alert = driver.findElement(By.id("alertBox"));
		alert.click();
	    Alert Alert = driver.switchTo().alert();
		System.out.println(Alert.getText());
		Alert.accept();
		
		WebElement alert2 = driver.findElement(By.id("confirmBox"));
		alert2.click();
		Alert Alert2 = driver.switchTo().alert();
		System.out.println(Alert2.getText());
		Alert.accept();
		
		WebElement alert3 = driver.findElement(By.id("promptBox"));
		alert3.click();
		Alert Alert3 = driver.switchTo().alert();
		System.out.println(Alert3.getText());
		Alert3.sendKeys("G vishwas Reddy");
		Alert.accept();		
		driver.close();
        }

}
