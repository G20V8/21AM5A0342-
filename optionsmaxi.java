package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class optionsmaxi {
	
	
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		//if(Url.contains("amaon")) {
		driver.manage().window().maximize();
		
		/* System.out.println("testcase is passed");}
		 else 
		 {
			 System.out.println("testcase is fail");
		 }*/
	}
}


