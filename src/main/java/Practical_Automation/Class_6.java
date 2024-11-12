package Practical_Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_6 
{
	@Test
	public void OpenBrowser()
	{
		WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    // Open URL
	    driver.get("https://www.amazon.in/");
	    
	    // Single Webelement
	    
	    WebElement element = driver.findElement(By.xpath("//a"));
	    System.out.println(element.getText());
	    
	 // Multiple Webelement
	    
	    List<WebElement> object = driver.findElements(By.xpath("//a"));
	    System.out.println(object.size());
	    
		
		  for(WebElement obj :object ) 
		  { 
			  System.out.println(obj.getText()); 
		  }

		  // Case of Wrong Xpath it will Return 0 
	    List<WebElement> wrong = driver.findElements(By.xpath("abcdd"));
	    System.out.println(wrong.size());
	    
	    driver.close();
	}
	
}
