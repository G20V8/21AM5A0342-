package webdriverinterfacemethods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginDWlocators {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username/phonenumber");
		String us =sc.nextLine();
		System.out.println("Enter Password");
		String pw = sc.nextLine();	
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(us);         //mail
		Thread.sleep(2000);
		
		driver.findElement(By.name("Password")).sendKeys(pw);        //Password
		Thread.sleep(2000);
		
		driver.findElement(By.name("RememberMe")).click();        //Remember
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();           //login
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"))
		{
			System.out.println("Successfully validated");
		}else{
			System.out.println("UnSuccessfully validated");
		}
	}
}

