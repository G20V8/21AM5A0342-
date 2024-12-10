package webdriverinterfacemethods;

import java.util.Scanner;

import org.openqa.selenium.By;

/*import java.util.Scanner;*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerDWS {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FirstName");
		String FirstName =sc.nextLine();
		
		System.out.println("Enter LastName");
		String LastName =sc.nextLine();
		
		System.out.println("Enter Email");
		String Email = sc.nextLine();	
		
		System.out.println("Password");
		String Password =sc.nextLine();
		
		System.out.println("ConfirmPassword");
		String ConfirmPassword =sc.nextLine();
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(2000);
		
		driver.findElement(By.className("ico-register")).click();        
		//Thread.sleep(2000);
		
		driver.findElement(By.id("gender-male")).click();         
		//Thread.sleep(2000);
		
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);        
		//Thread.sleep(2000);
		
		driver.findElement(By.id("LastName")).sendKeys(LastName);      
		//Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(Email);      
		//Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys(Password);      
		//Thread.sleep(2000);
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		
		driver.findElement(By.id("register-button")).click();  
		
		driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/registerresult/1"))
		{
			System.out.println("Successfully validated");
		}else{
			System.out.println("UnSuccessfully validated");
		}
	}
}



