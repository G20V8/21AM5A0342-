package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logic {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://quettanex.com/");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Quetta Nex Solutions – We Innovate Technology")) {
			System.out.println("P");
		}else {
		    System.out.println("F");
		}
		
		driver.quit();
		}

}
