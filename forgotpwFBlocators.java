package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotpwFBlocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		
		driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().equals("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0")) {
			System.out.println("Successfully validated");
		}else {
			System.out.println("UnSuccessfully validated");
		}
		}

}
