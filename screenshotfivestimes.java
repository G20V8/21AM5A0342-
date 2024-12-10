package webdriverinterfacemethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class screenshotfivestimes {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		for(int i =1; i<=10;i++) {
		WebElement ts = driver.findElement(By.xpath("//img[@data-image-index='"+i+"']"));
		
		File temp = ts. getScreenshotAs(OutputType.FILE);    
		                       
		File per = new File("./sample/amazon"+i+".png"); 
		System.out.println(per);
		FileHandler.copy(temp, per);}
		driver.quit();
	}
}
