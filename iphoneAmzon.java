package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphoneAmzon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
        
        
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        
        
        driver.findElement(By.id("a-autoid-1-announce")).click();
        Thread.sleep(2000);
        
        
        driver.findElement(By.id("nav-cart-count")).click();
       
        
        if(driver.getCurrentUrl().equals("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart")) {
        	System.out.println("Test case pass");
        }
        else {
        	System.out.println("Test case fails");
        }

	}

}