package webdriverinterfacemethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class moussehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://demowebshop.tricentis.com/");
     
     Actions a1 = new Actions(driver);
     
     WebElement com =driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
     a1.moveToElement(com).perform();
     
     WebElement des = driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
     a1.click(des).perform();
     
     if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/desktops"))
    	 System.out.println("pass");
     else
    	 System.out.println("fail");
    	
     WebElement des1 = driver.findElement(By.xpath("(//a[contains(text(),'Desktop PC with CDRW')])"));
     a1.click(des1).perform();
     if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/desktop-pc-with-cdrw"))
    	 System.out.println("pass");
     else
    	 System.out.println("fail");
     
     WebElement ts = driver.findElement(By.xpath("//img[@alt='Picture of Desktop PC with CDRW']"));
		
		File temp = ts. getScreenshotAs(OutputType.FILE);    
		System.out.println(temp);                         
		File per = new File("./sample/des.png");             
		FileHandler.copy(temp, per);
		driver.quit();
	}

}
