package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerdemoDSskillrary 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		if (driver.getCurrentUrl().equals("https://demoapp.skillrary.com/"))
		{
			System.out.println("TESTCASE PASS");
		}
		else
		{
			System.out.println("TESTCASE FAIL ");
		}
		Thread.sleep(5000);
		driver.findElement(By.linkText("SIGNUP")).click();
		Thread.sleep(5000);
		if (driver.getCurrentUrl().equals("https://demoapp.skillrary.com/login.php?type=register"))
		{
			System.out.println("TESTCASE PASS ");
		}
		else
		{
			System.out.println("TESTCASE FAIL ");
		}
		driver.findElement(By.cssSelector("input[placeholder=\'First Name\']")).sendKeys("vishwas");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder=\'Last Name\']")).sendKeys("reddy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\'email\']")).sendKeys("21am5a0342@svrec.ac.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@name,'password')])[2]")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@name,'password')])[3]")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\'submit\']")).click();
		if (driver.getCurrentUrl().equals("https://demoapp.skillrary.com/login.php"))
		{
			System.out.println("TESTCASE PASS");
		}
		else
		{
			System.out.println("TESTCASE FAIL");
		}
		
	}
}