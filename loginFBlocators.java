package webdriverinterfacemethods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFBlocators {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username/phonenumber");
		String us =sc.nextLine();
		System.out.println("enter password");
		String pw = sc.nextLine()
;	
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(us);         //username/mobilenumber
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys(pw);        //Password
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();           //login
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://www.facebook.com/"))
		{
			System.out.println("Successfully validated");
		}else{
			System.out.println("UnSuccessfully validated");
		}
		
	
	}

}
