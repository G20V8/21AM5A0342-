package webdriverinterfacemethods;

import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) {
		
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            
            driver.get("https://www.redbus.in/");
            
            driver.findElement(By.id("src")).sendKeys("Hyderabad");
            driver.findElement(By.id("dest")).sendKeys("Bangalore");
            driver.findElement(By.id("search_button")).click();

            
	}
	

}
