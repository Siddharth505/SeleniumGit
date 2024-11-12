import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview
{
	public WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.orangehrm.com/");
	}
   @Test
   public void Handle()
   {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,7000)");
	   driver.findElement(By.xpath("(//div[@class='social-icon'])[2]")).click();
       driver.findElement(By.id("join-form-submit")).click();
   }
	@AfterTest
	public void CloseSetup()
	{
		driver.close();
	}
   
	
}
