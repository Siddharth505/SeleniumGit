package Selenium_Interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.AWTEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_Enter_Text_Without_Sendkeys3 
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
	    
	    WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	    dropdown.click(); 
	    Select sel=new Select(dropdown);
	    sel.selectByValue("Alexa Skills");
	    List<WebElement> options=sel.getOptions();
	    options.size();
	    
	    for(int i=0;i<options.size();i++)
	    {
	    	options.get(i).getText();
	    }
	   
	    
	    driver.close();
	    
	}

}
