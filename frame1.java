package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/frames?sublist=0")) {
			System.out.println("TCP");
			}else {
			System.out.println("TCF");
		    }
		//WebElement f = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("8688912859");
		driver.findElement(By.id("password")).sendKeys("869688dsdf");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();		
		Thread.sleep(2000);
		driver.close();
	}
}

	

