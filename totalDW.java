package webdriverinterfacemethods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalDW {
	public static void main(String[] args) throws InterruptedException {
		
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.className("ico-register")).click();
				
				if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/register"))
				{
					System.out.println("Successfully validated");
					driver.navigate().back();
				}else{
					System.out.println("UnSuccessfully validated");
				}
			
		
		      driver.findElement(By.className("ico-login")).click();
		
		      driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login"))
		{
			System.out.println("Successfully validated");
		}else{
			System.out.println("UnSuccessfully validated");
		}
	    
		driver.navigate().back();
		
		driver.findElement(By.className("cart-label")).click();
		
		driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/cart"))
		{
			System.out.println("Successfully validated");
		}else {
			System.out.println("UnSuccessfully validated");
		}
		
		driver.navigate().back();
		
		driver.findElement(By.className("ico-wishlist")).click();
		
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/wishlist")) {
			System.out.println("Successfully validated");
			driver.navigate().back();
		}else {
			System.out.println("UnSuccessfully validated");
		}
	}
	}
		
		

