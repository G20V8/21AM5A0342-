package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleandgetcurrenturl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
		Thread.sleep(1000);
		
		String url=driver.getCurrentUrl();       
		System.out.println(url);                   //System.out.println(driver.getCurrentUrl()); 
		
		String title=driver.getTitle();
		System.out.println(title);                 //System.out.println(driver.getTitle());
	}

}
