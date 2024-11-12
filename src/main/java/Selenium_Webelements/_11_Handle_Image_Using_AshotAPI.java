package Selenium_Webelements;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class _11_Handle_Image_Using_AshotAPI 
{
	@Test
	  public void Upload() throws AWTException, InterruptedException, IOException
	  {
		  WebDriverManager.chromedriver().setup();
			//ChromeDriverManager.chromiumdriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	
	        WebElement ele = driver.findElement(By.xpath("//img[@alt='company-branding']"));
	        Thread.sleep(4000);
	        Screenshot logoscreenshot= new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, ele);
	        ImageIO.write(logoscreenshot.getImage(), "png", new File("F://Project 1//Automation//screenshots"));
	
	        File f = new File("F://Project 1//Automation//screenshots");
	        if(f.exists())
	        {
	         System.out.println("Image Exists");      	
	        }
	        else
	        	System.out.println("Does Not Exist");
	  }
	

}
