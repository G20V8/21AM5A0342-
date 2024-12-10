package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		if(driver.getCurrentUrl().equals("https://www.dream11.com/")) {
			System.out.println("TCP");
			}else {
			System.out.println("TCF");
		    }
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("8688912859");
		driver.findElement(By.id("regUser")).click();
		
		driver.close();
	}
}

	

