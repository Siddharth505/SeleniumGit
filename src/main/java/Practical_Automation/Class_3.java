package Practical_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_3 
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
	    
	    // Capture Title
	    String title= driver.getTitle();
	    System.out.println("Title of PAGE is"+ title);
	    
	    // Current URL
	    System.out.println("URL of Page is"+ driver.getCurrentUrl());
	    
	    // Page Source
	    System.out.println("PageSource of Page is"+ driver.getPageSource());
	    driver.close();
	}

}
