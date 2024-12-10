package webdriverinterfacemethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass11getsizegetposition {
	  public static void main(String[]args) {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https:\\www.yotube.com/");
		  driver.manage().window().maximize();
		  
		  if(driver.getTitle().equals("YouTube")) {
			  System.out.println("test case pass");}
		  else {
			  System.out.println("test case fail");
		  }
		  Point cor =driver.manage().window().getPosition();
		  System.out.println(cor.x);
		  System.out.println(cor.y);
		  
		  Dimension size =driver.manage().window().getSize();
		  System.out.println(size.height);
		  System.out.println(size.width);
		  
		  driver.quit();
		  
	  }

}
