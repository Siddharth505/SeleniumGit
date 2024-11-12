package Selenium_Webelements;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _5_Handle_PageScrolling 
{
	@Test
	public void AB() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	//ChromeDriverManager.chromiumdriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
   
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1000)");
	/*
	 * for(int i=0;i<=4;i++) { Thread.sleep(4000);
	 * js.executeScript("window.scrollBy(0,1000)"); }
	 */
	}
	

}
