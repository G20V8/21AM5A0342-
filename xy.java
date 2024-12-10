package webdriverinterfacemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://svrec.ac.in/svrec_sis/login.aspx");
		
		
		WebElement search = driver.findElement(By.id("Label1"));
		String tag = search.getTagName();	
		System.out.println(tag);
	
		
		WebElement search1 = driver.findElement(By.id("Label1"));
		Dimension h1w1 = search1.getSize();	
		System.out.println(h1w1.height);
		System.out.println(h1w1.width);
		
		System.out.println("-------------------");
		
		Point co = search1.getLocation();
		System.out.println(co.x);
		System.out.println(co.y);
		
		System.out.println("-------------------");
		Rectangle rec = search1.getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.height);
		System.out.println(rec.width);
		
		driver.close();
	}

}
