package webdriverinterfacemethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen_shotwebpage {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		if(driver.getCurrentUrl().equals("https://www.flipkart.com/"))
			System.out.println("TEST CASE PASS");
		else
			System.out.println("TEST CASE FAIL");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);    
		System.out.println(temp);                         
		File per = new File("./sample/v1.png");             
		FileHandler.copy(temp, per);
		driver.close();
	}

}
