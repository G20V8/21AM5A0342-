package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qQspidersdemologin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("vishvishwasreddy@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("21Am5a0342@");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/button")).click();
		

	}

}
