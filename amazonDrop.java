package webdriverinterfacemethods;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		if (driver.getCurrentUrl().equals("https://www.amazon.in/")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");

	}
		WebElement all=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(all);
		
		List<WebElement>options=s1.getOptions();
		ListIterator<WebElement> i=options.listIterator();
		
		System.out.println("Ascending Order");
		
		while(i.hasNext()) {
			System.out.println(i.next().getText());
		}
		
		System.out.println("Descending Order");
		
		while(i.hasPrevious()) {
			System.out.println(i.previous().getText());
		}
		
		driver.quit();
		
	}

}