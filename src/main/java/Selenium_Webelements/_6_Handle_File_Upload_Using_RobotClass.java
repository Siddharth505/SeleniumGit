package Selenium_Webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _6_Handle_File_Upload_Using_RobotClass 
{
  @Test
  public void Upload() throws AWTException, InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.foundit.in/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	  
	    driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']/..")).click();
	    
	    WebElement uploadpopup= driver.findElement(By.xpath("//input[@id='file-upload']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();",uploadpopup);
	    
	    //copy the path
	    //CTRL + V
	    // Press Enter
	    
	    
	    
	StringSelection ss = new StringSelection("C:\\Users\\Siddharth\\Desktop\\My Folder\\5. Selenium BDD\\CV.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_V);
	Thread.sleep(4000);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(4000);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(4000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	
	
  }
}
