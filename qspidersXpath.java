package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspidersXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://student.qspiders.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishvishwasreddy@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[2]/div[1]/div/div/div[2]/div/div/div/div/input")).sendKeys("21Am5a0342@");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    if(driver.getCurrentUrl().equals("https://student.qspiders.com/")) {
	    	System.out.println("TESTCASE PASS");}
	    else {
	    	System.out.println("TESTCASE FAIL");
	    }

	}

}
