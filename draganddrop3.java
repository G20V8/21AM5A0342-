package webdriverinterfacemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

       
        String[] sourceIds = {"box1", "box2", "box3", "box4", "box5", "box6", "box7"};
        
        String[] targetIds = {"box101", "box102", "box103", "box104", "box105", "box106", "box107"};

        Actions actions = new Actions(driver);

        
        for (int i = 0; i < sourceIds.length; i++) {
            WebElement sourceElement = driver.findElement(By.id(sourceIds[i]));
            WebElement targetElement = driver.findElement(By.id(targetIds[i]));
            
      
            actions.dragAndDrop(sourceElement, targetElement).perform();
            
         
            Thread.sleep(5000);
        }

        
        driver.quit();
    }
}
