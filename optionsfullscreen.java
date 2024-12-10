package webdriverinterfacemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class optionsfullscreen {
	public static void main(String[]args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
	}

}
