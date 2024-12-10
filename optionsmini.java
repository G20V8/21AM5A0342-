package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class optionsmini {
	public static void main(String[]args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ust.com/");
		driver.manage().window().minimize();
	}

}
