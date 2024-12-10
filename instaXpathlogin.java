package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaXpathlogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("G20v6");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("21Am5a0342@");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/div/div/button")).sendKeys("d");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    if(driver.getCurrentUrl().equals("https://www.instagram.com/accounts/onetap/?next=%2F&hl=en")) {
	    	System.out.println("TESTCASE PASS");}
	    else {
	    	System.out.println("TESTCASE FAIL");
	    }
	}

}
