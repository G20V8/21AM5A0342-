package webdriverinterfacemethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {
	public static void main(String[]args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https:\\www.flipkart.com/");
	   
	   Thread.sleep(2000);
	   Dimension size = driver.manage().window().getSize();
	   System.out.println(size.height);
	   System.out.println(size.getWidth());
	   driver.quit();
	   }

}
