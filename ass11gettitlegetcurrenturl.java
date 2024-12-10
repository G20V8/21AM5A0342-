package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ass11gettitlegetcurrenturl {
	
     public static void main(String[]args) throws InterruptedException  {
    	 WebDriver driver = new EdgeDriver();
    	 driver.get("https://www.youtube.com/");
    	 
    	 Thread.sleep(10000);
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	 
    	 String url = driver.getCurrentUrl();
    	 System.out.println(url);
     }
}
