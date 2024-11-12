package Selenium_Webelements;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _10_Handle_File_Upload_Using_AUTOiT 
{
	@Test
	  public void Upload() throws AWTException, InterruptedException, IOException
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
		    
				Runtime.getRuntime().exec("F://software//AutoIDPrograms//FileUpload.exe");
				
		    }
		    
		    
	  }
	

