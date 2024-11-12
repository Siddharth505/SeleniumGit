package Selenium_Webelements;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _3_Handle_Screenshot {
	
	@Test
	public void AB() throws IOException
	{
		WebDriverManager.chromedriver().setup();
	//ChromeDriverManager.chromiumdriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	
    // Full Page
	 TakesScreenshot tp = (TakesScreenshot)driver; 
	 File src = tp.getScreenshotAs(OutputType.FILE); 
	 File trg = new File(".\\screenshots\\Interview.png"); 
	 FileUtils.copyFile(src, trg);
	
	
	// Specific Area
	WebElement area = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	File src1=area.getScreenshotAs(OutputType.FILE);
	File trg1=new File(".\\screenshots\\Area.png");
	FileUtils.copyFile(src1, trg1);
	
	//driver.close();
	}
}
