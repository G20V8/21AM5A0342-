package webdriverinterfacemethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotdemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Robot rb = new Robot();
		for(int i =0;i<=2;i++) {
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		}
		
		
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		
		rb.keyPress(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_W);
		
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		
		rb.keyPress(KeyEvent.VK_Y);
		rb.keyRelease(KeyEvent.VK_Y);
		
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_2);
		
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyRelease(KeyEvent.VK_2);
		
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		WebElement cor =driver.findElement(By.xpath("//label[contains(text(),'Remember me?')]"));
		System.out.println(cor.getLocation().getX());
		System.out.println(cor.getLocation().getY());
		/*Point cor1 = driver.manage().window().getPosition();
		   System.out.println(cor1.x);
		   System.out.println(cor1.y);*/
		
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Simulate left-click

		   
		   
		/*rb.mousePress(812);
		rb.mouseRelease(812);	
		
		rb.mousePress(400);
		rb.mouseRelease(400);	*/
		
		rb.mouseMove(812, 400);
		
		   
		   			
	
		
		
	}

}


