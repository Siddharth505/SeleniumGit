package Selenium_Interview;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.AWTEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_Enter_Text_Without_Sendkeys2 
{
	
	@Test
	public void Send() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple i phone");
	    Thread.sleep(4000);
	    //driver.findElement(By.id("nav-search-submit-text")).click();
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//span[.='Apple iPhone 14 (128 GB) - Midnight']/ancestor::div[@class='a-section']//span[@class='s-color-swatch-inner-circle-border']")).click();
	    
	   Set<String> S = driver.getWindowHandles();
	    System.out.println(S);
	    driver.navigate().to("https://www.amazon.in/");
	}

}
