package webdriverinterfacemethods;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ascdesHYRturo {

	public static void main(String[] args) {
		
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            
           WebElement all = driver.findElement(By.id("course"));
            Select s1 = new Select(all);
            List options = s1.getOptions();
            ListIterator<WebElement> i= options.listIterator();
            
            Collections.sort(options);
            ListIterator itr=options.listIterator();
            
            while(itr.hasNext()) {
            	System.out.println(i.next().getText());
            }
            System.out.println("--------");
            while(i.hasPrevious()) {
            	System.out.println(i.previous().getText());
            }
            
	}

}
