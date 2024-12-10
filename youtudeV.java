package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtudeV {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[aria-label=\"Search\"]")).sendKeys("Doreman");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.id("video-title")).click();
		if(driver.getCurrentUrl().equals("https://www.youtube.com/watch?v=zUrFSzdtzA0")) {
			   System.out.println("TESTCASE PASS");}
		else{
				   System.out.println("TESTCASE FAIL");
			   
			}
	}

}
