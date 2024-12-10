package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class navigatestringurl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.redbus.in/");
		
		WebElement searchbar = driver.findElement(By.id("src"));
		searchbar.sendKeys("Hyderabad");
		
		WebElement searchbar1 = driver.findElement(By.id("dest"));
		searchbar1.sendKeys("Bangalore");
		
		WebElement searchbar11 = driver.findElement(By.id("Head1"));
		searchbar11.sendKeys("31 AUG 2024");
		
		driver.findElement(By.id("search_button")).click();
		driver.close();
		

		String title=driver.getTitle();
		System.out.println(title); 
		
	
		
		if(driver.getTitle().contains("Online")) {
			System.out.println("Test case is pass");
			//driver.close();
		}
		else {
			System.out.println("Test case is fail");
			//driver.close();
		}
	}

}
