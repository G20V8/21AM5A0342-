package webdriverinterfacemethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text() = 'UI Testing Concepts']")).click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui?scenario=1"))
		{
			System.out.println("TESTCASE PASS.");
		}
		else
		{
			System.out.println("TESTCASE FAIL.");
		}
		driver.findElement(By.xpath("//section[text() = 'Frames']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text() = 'iframes']")).click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/frames?sublist=0"))
		{
			System.out.println("TESTCASE PASS.");
		}
		else
		{
			System.out.println("TESTCASE FAIL.");
		}
		driver.findElement(By.xpath("//a[text() = 'Nested iframe']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		List<WebElement> test_data = driver.findElements(By.xpath("//p[@class =  'para']"));
		ArrayList<String> data = new ArrayList<String>();
		for (WebElement webElement : test_data) 
		{
			data.add(webElement.getText());
		}
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(data.get(0));
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(data.get(1));
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys(data.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}
} 