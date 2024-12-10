package webdriverinterfacemethods;


import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ass11maxidemoshop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the browser name \n(chrome, firefox, edge): ");
	        String title = sc.nextLine().toLowerCase();
	        WebDriver driver;
			
			if (title.equalsIgnoreCase(title)) 
				System.out.println("TESTCASE IS PASSED");
			else
			{
				System.out.println("TESTCASE IS FAILED");
			}

	        switch (title) {
	            case "chrome":
	                driver = new ChromeDriver();
	            	driver.get("https://demowebshop.tricentis.com/");
	            	driver.manage().window().maximize();
	            	String Url1 = driver.getCurrentUrl();
	    			System.out.println(Url1);
	    			
	    			String title1 = driver.getTitle();
	    			System.out.println(title1);
	            	
	                break;

	            case "firefox":
	              
	            	driver = new FirefoxDriver();
	            	driver.get("https://demowebshop.tricentis.com");
	            	driver.manage().window().maximize();
	            	String Url2 = driver.getCurrentUrl();
	    			System.out.println(Url2);
	    			
	    			String title2 = driver.getTitle();
	    			System.out.println(title2);
	                break;

	            case "edge":
	              
	                driver = new EdgeDriver();
	                driver.get("https://demowebshop.tricentis.com/");
	                driver.manage().window().maximize();
	                String Url = driver.getCurrentUrl();
	    			System.out.println(Url);
	    			
	    			String title3 = driver.getTitle();
	    			System.out.println(title3);
	                break;

	            default:
	                System.out.println("Unsupported browser! Please choose between chrome, firefox, and edge.");
	                
	        }
}}

