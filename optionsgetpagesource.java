package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class optionsgetpagesource {
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.facebook.com/");
	     
		//String page  =driver.getPageSource();
		//System.out.println(page);
		
		System.out.println(driver.getPageSource());
		
		
	}

}
