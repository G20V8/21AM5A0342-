package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class skillaryMultiselect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		if(driver.getCurrentUrl().equals("https://demoapp.skillrary.com/")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		WebElement car=driver.findElement(By.id("cars"));
		
		Select s1=new Select(car);
		if(s1.isMultiple()) {
			s1.selectByValue("99");
			Thread.sleep(2000);
			s1.selectByValue("299");
			Thread.sleep(2000);
			s1.selectByValue("500");
			Thread.sleep(2000);
			s1.deselectAll();
		}
		else {
			System.out.println("Single Select");
		}
		driver.close();

	}

}