package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoDSskillrary {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demoapp.skillrary.com/");
			Thread.sleep(2000);
			
           if(driver.getCurrentUrl().equals("https://demoapp.skillrary.com/")) {
				
				System.out.println("Successfully validated");
			}
			else {
				System.out.println("Unsuccessfully validated");
			}
			
			driver.findElement(By.linkText("LOGIN")).click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().equals("https://demoapp.skillrary.com/login.php?type=login")) {
				
				System.out.println("Successfully validated");
			}
			else {
				System.out.println("Unsuccessfully validated");
			}
			
			
			driver.findElement(By.name("email")).sendKeys("admin");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("admin");
			Thread.sleep(2000);
			
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("last")).click();
			Thread.sleep(2000);
			
	        
	         
			driver.quit();
		}

	}