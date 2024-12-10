package webdriverinterfacemethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupsirtc {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		Robot rb  =new Robot();
		for(int i=0;i<=1;i++) {
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		}
		
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
	
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
