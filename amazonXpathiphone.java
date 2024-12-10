package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonXpathiphone {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String Url= driver.getCurrentUrl();
		
		if(Url.contains("amazon")) {
			System.out.println("TESTCASE PASS");
		}else {
			System.out.println("TESTCASE FAIL");
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement Apple=driver.findElement(By.xpath("(//span[contains(text(),'Apple')])[4]/../../../.."));
	    System.out.println(Apple.getText());
		driver.quit();
	}

}
