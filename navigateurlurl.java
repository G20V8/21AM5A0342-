package webdriverinterfacemethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateurlurl {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         URL url = new URL("https://www.redbus.in/");
         driver.navigate().to(url);                       // OR driver.navigate().to(new String("https://www.redbus.in/"));
         
         String title=driver.getTitle();
 		 System.out.println(title); 
         
         if(driver.getTitle().contains("Online")) {
 			System.out.println("Test case is pass");
 			driver.close();
 		}
 		else {
 			System.out.println("Test case is fail");
 			driver.close();
	         }
	    }
}


