package webdriverinterfacemethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class screen_shotwebelement {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(2000);
		WebElement ts = driver.findElement(By.xpath("(//img[@loading='eager'])[1]"));
		Thread.sleep(2000);
		File temp = ts. getScreenshotAs(OutputType.FILE);    
		System.out.println(temp);                         
		File per = new File("./sample/v1.png");             
		FileHandler.copy(temp, per);
		driver.close();
	}
}
