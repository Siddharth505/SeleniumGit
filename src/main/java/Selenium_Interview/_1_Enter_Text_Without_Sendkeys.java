package Selenium_Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.AWTEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_Enter_Text_Without_Sendkeys 
{
	
	@Test
	public void Send() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    WebElement link = driver.findElement(By.id("twotabsearchtextbox"));
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    
	    // Way 1 : Using Console : Not Working  
	    //js.executeScript("document.getElementById(‘twotabsearchtextbox').value=“abc.efg@xyz.com”)
	    
	    // Way 2:
	    //js.executeScript("arguments[0].value='sendkeys'",link);
	    
	    // Way 3: Using Actions Class
         
	    //Actions act = new Actions(driver);
	    //act.sendKeys(link,"USING ACTION CLASS").perform();
        	
	    // Way 4: Using Robot Class
	    
	    Robot robot = new Robot();
	    link.click();
	    Thread.sleep(4000);
	    robot.keyPress(KeyEvent.VK_S);
	    Thread.sleep(4000);
	    robot.keyPress(KeyEvent.VK_I);
	    Thread.sleep(4000);
	    robot.keyPress(KeyEvent.VK_D);
	    Thread.sleep(4000);
	    
	}

}
