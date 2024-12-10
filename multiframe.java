package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui?scenario=1"))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Testcase fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@class,'bg-gradient-to-r')]//section[contains(text(),'Web')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/frames?sublist=0"))
		{
			System.out.println("Testcase pass for frames");
		}
		else
		{
			System.out.println("Testcase fail for frames");
		}
		driver.findElement(By.xpath("//a[text()='Default']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Prashanth");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Prashanth@25");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Multiple iframe')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Admin@1234");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("Admin@1234");
		driver.findElement(By.cssSelector("button[id='submitButton']")).click();
		Thread.sleep(5000);
		
		WebElement iframe = driver.findElement(By.xpath("(//form[@id='form'])"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		

	}

}
