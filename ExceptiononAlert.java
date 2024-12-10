package webdriverinterfacemethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptiononAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		
		WebElement addcart = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//addcart.click();
		Alert ref = driver.switchTo().alert();
		System.out.println(ref.getText());
		ref.accept();
		
		//System.out.println(addcart.getText());
		
				}

}
