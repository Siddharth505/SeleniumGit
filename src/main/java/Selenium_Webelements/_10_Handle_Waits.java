package Selenium_Webelements;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _10_Handle_Waits 
{
	@Test
	  public void Upload() throws AWTException, InterruptedException, IOException
	  {
		  WebDriverManager.chromedriver().setup();
			//ChromeDriverManager.chromiumdriver().setup();
		    WebDriver driver = new ChromeDriver();
		    WebDriverWait wait =  new WebDriverWait(driver, 3);
		    driver.get("https://www.foundit.in/");
		    driver.manage().window().maximize();
		    
		  //  JavascriptExecutor js = (JavascriptExecutor) driver;
		    //js.executeScript("WindowsScrollBy(400,600)");
            WebElement option=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='info@foundit.in']")));
            
            option.click();
	  }
}
