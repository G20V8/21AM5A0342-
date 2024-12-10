package webdriverinterfacemethods;


import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class qspidersDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/dropdown?sublist=0")){
			System.out.println("TESTCASE PASS");}
		else {
			System.out.println("TESTCASE FAIL");
		}
		
		driver.findElement(By.id("phone")).sendKeys("8688912859");
		
		 WebElement gender = driver.findElement(By.id("select2"));
		 Select s1 = new Select(gender);
		 s1.selectByIndex(1);
		 
		 WebElement country = driver.findElement(By.id("select3"));
		 Select s2 = new Select(country);
		 s2.selectByVisibleText("India");
		 
		 WebElement State = driver.findElement(By.id("select5"));
		 Select s3 = new Select(State);
		 s3.selectByVisibleText("Andhra Pradesh");
		 
		 WebElement City = driver.findElement(By.xpath("(//select[contains(@class,'border-0')])[5]"));
		 Select s4 = new Select(City);
		 s4.selectByVisibleText("Kurnool");
		 
		 WebElement quantity = driver.findElement(By.id("select7"));
		 Select s5 = new Select(quantity);
		 s5.selectByVisibleText("2");
		 
		 driver.findElement(By.id("continuebtn")).click();
		 Thread.sleep(2000);
		 
		 if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/radio?sublist=0")){
				System.out.println("TESTCASE PASS");}
			else {
				System.out.println("TESTCASE FAIL");
			}
		 
		 
		 driver.findElement(By.xpath("(//input[contains(@name,'Attended')])[1]")).click();
		 driver.findElement(By.xpath("(//input[contains(@name,'Willing')])[1]")).click();
		 driver.findElement(By.id("btn")).click();
		 driver.findElement(By.id("domain1")).click();
		 driver.findElement(By.id("mode1")).click();
		 driver.findElement(By.id("mode5")).click();
		 Thread.sleep(2000);
		 
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("(//input[contains(@class,'border-2 border')])[1]")).click();
		 Thread.sleep(2000);
		 
		 if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/toggle?sublist=0")){
				System.out.println("TESTCASE PASS");}
			else {
				System.out.println("TESTCASE FAIL");
			}
		 driver.findElement(By.xpath("(//span[contains(@class,'relative')])[2]")).click();
		 driver.findElement(By.xpath("(//span[contains(@class,'relative')])[3]")).click();
		 driver.findElement(By.xpath("(//span[contains(@class,'relative')])[4]")).click();
	     driver.findElement(By.xpath("(//span[contains(@class,'relative')])[5]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("togglers")).click();	 
         Thread.sleep(2000);
	     
	     if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/image?sublist=0")){
				System.out.println("TESTCASE PASS");}
			else {
				System.out.println("TESTCASE FAIL");
			}
		 }

}
