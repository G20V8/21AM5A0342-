package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		if(driver.getTitle().equals("Downloads | Selenium")) {
			System.out.println("TESTCASE PASS");
	        }else {
				System.out.println("TESTCASE FAIL");
			}
		WebElement version = driver.findElement(By.xpath("//p[text()='Java']/../p[2]"));
		System.out.println(version.getText());
		System.out.print("JAVA");
		
		WebElement version0 = driver.findElement(By.xpath("//p[text()='C#']/../p[2]"));
		System.out.println(version0.getText());
		System.out.print("C#");
		
		WebElement version1 = driver.findElement(By.xpath("//p[text()='Ruby']/../p[2]"));
		System.out.println(version1.getText());
		System.out.print("RUBY");
		
		WebElement version2 = driver.findElement(By.xpath("//p[text()='Python']/../p[2]"));
		System.out.println(version2.getText());
		System.out.print("PYTHON");
		
		WebElement version3 = driver.findElement(By.xpath("//p[text()='JavaScript']/../p[2]"));
		System.out.println(version3.getText());
		System.out.print("JAVASCRIPT");
		
	}

}
