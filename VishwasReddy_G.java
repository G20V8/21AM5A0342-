package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VishwasReddy_G {

    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver (Example: Chrome)
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://demoapp.skillrary.com/login.php");

        // 1. Locate by ID
        try {
            WebElement elementById = driver.findElement(By.id("APjFqb"));
            System.out.println("Element found by ID");
        } catch (Exception e) {
            System.out.println("Element not found by ID");
        }

        // 2. Locate by Name
        try {
            WebElement elementByName = driver.findElement(By.name("element_name"));
            System.out.println("Element found by Name");
        } catch (Exception e) {
            System.out.println("Element not found by Name");
        }

        // 3. Locate by Class Name
        try {
            WebElement elementByClassName = driver.findElement(By.className("input[type=\\'email\\']"));
            System.out.println("Element found by Class Name");
        } catch (Exception e) {
            System.out.println("Element not found by Class Name");
        }

        // 4. Locate by Tag Name
        try {
            WebElement elementByTagName = driver.findElement(By.tagName("element_tag"));
            System.out.println("Element found by Tag Name");
        } catch (Exception e) {
            System.out.println("Element not found by Tag Name");
        }

        // 5. Locate by Link Text (for anchor elements)
        try {
            WebElement elementByLinkText = driver.findElement(By.linkText("Exact Link Text"));
            System.out.println("Element found by Link Text");
        } catch (Exception e) {
            System.out.println("Element not found by Link Text");
        }

        // 6. Locate by Partial Link Text (for anchor elements)
        try {
            WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Partial Link Text"));
            System.out.println("Element found by Partial Link Text");
        } catch (Exception e) {
            System.out.println("Element not found by Partial Link Text");
        }

        // 7. Locate by CSS Selector
        try {
        	Thread.sleep(5000);
            WebElement elementByCssSelector = driver.findElement(By.cssSelector("//tagname[@attribute='value']"));
            System.out.println("Element found by CSS Selector");
        } catch (Exception e) {
            System.out.println("Element not found by CSS Selector");
        }

        // 8. Locate by XPath
        try {
        	Thread.sleep(5000);
            WebElement elementByXPath = driver.findElement(By.xpath("//tagname[@attribute='value']"));
            System.out.println("Element found by XPath");
        } catch (Exception e) {
            System.out.println("Element not found by XPath");
        }

        // Close the browser
        driver.quit();
    }
}