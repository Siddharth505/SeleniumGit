package Selenium_Webelements;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _9_Handle_Exceptions 
{
	
	@Test
	public void Send() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	    // 1 No Such Element Exception
		    
	    //WebElement ele = driver.findElement(By.xpath("abcdddd"));
	    //ele.click();
	      
	   // 2 No Such Frame Exception
 	    //driver.switchTo().frame("Text");

	  // 3 No Such Window Exception
	  //driver.switchTo().window("Text");
	  
	    // 4 No Alert Present Exception
	    driver.switchTo().alert();
	    driver.close();
	}

}
