 package webdriverinterfacemethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class points {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_l")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("id_text_signin")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("loginfmt")).sendKeys("vishvishwasreddy@outlook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("passwd")).sendKeys("21Am5a0342@@");
		Thread.sleep(2000);
		
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("declineButton")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("sb_form_q")).sendKeys("dharani");
		Thread.sleep(7000);
	
	
		driver.findElement(By.id("search_icon")).click();
		Thread.sleep(3000);
		

		
		driver.findElement(By.id("Clear text")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("sb_form_q")).sendKeys("bandi");
		Thread.sleep(7000);
		

		driver.findElement(By.id("search_icon")).click();
		Thread.sleep(3000);
		
		
		//driver.findElement(By.className("b_searchboxSubmit")).click();
		//Thread.sleep(2000);
		
	}

}