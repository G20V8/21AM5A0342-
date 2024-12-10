package webdriverinterfacemethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getposition {
	public static void main(String[]args) throws InterruptedException {
		
			   WebDriver driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   
			   driver.get("https:\\www.flipkart.com/");
			   
			   Thread.sleep(2000);
			   Point cor = driver.manage().window().getPosition();
			   System.out.println(cor.x);
			   System.out.println(cor.y);
			   driver.quit();
	}
}
