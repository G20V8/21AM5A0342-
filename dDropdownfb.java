package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dDropdownfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("vishwas");
		
		driver.findElement(By.name("lastname")).sendKeys("vishwas");
		
		driver.findElement(By.name("reg_email__")).sendKeys("vishwas@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("ygyttfy896=");
		
		 WebElement day = driver.findElement(By.id("day"));
		 Select s1 = new Select(day);
		 s1.selectByIndex(1);
		 
		 WebElement month = driver.findElement(By.id("month"));
		 Select s2 = new Select(month);
		 s2.selectByIndex(9);
		 
		 WebElement year = driver.findElement(By.id("year"));
		 Select s3 = new Select(year);
		 s3.selectByIndex(2);
		 
		 driver.findElement(By.xpath("//label[text()='Male']")).click();
		 driver.findElement(By.name("websubmit")).click();
		 
		 driver.getTitle();
	}

}
