package webdriverinterfacemethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getlink {
	
		public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("user enter the brower");
		String name = sc.next();
		if (name.equalsIgnoreCase(name)) 
			System.out.println("TESTCASE IS PASSED");
		else
		{
			System.out.println("TESTCASE IS FAILED");
		}
		
		WebDriver driver;
		
		if(name.equalsIgnoreCase("Chrome")){
		driver=new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		driver.manage().window().maximize();
	
		}
		else if(name.equalsIgnoreCase("Edge")) {
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		if (name.equalsIgnoreCase(name)) 
			System.out.println("TESTCASE IS PASSED");
		else
		{
			System.out.println("TESTCASE IS FAILED");
		}
	    }
		else if(name.equalsIgnoreCase("firefox")) {
	    driver=new FirefoxDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    if (name.equalsIgnoreCase(name)) 
			System.out.println("TESTCASE IS PASSED");
		else
		{
			System.out.println("TESTCASE IS FAILED");
		}
	    }else {
	    	System.out.println("no broswer");
	    }
		

		}

	}



