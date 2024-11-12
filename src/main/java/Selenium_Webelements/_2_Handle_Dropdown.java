package Selenium_Webelements;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class _2_Handle_Dropdown 
{
	@Test
	public void B() throws InterruptedException
	{
		//ChromeDriverManager.chromiumdriver().setup();
		//System.setProperty("webdriver.chrome.driver","F:/Project 1/Automation/Drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    Thread.sleep(4000);
	    
	    WebElement daydropdown = driver.findElement(By.id("day"));
	    Actions act = new Actions(driver);
	    act.moveToElement(daydropdown).click(daydropdown).perform();
	    Alert alt = driver.switchTo().alert();
	    Select sel = new Select(daydropdown);
	    
	    sel.selectByValue("28");
	    sel.selectByIndex(3);
	    
	    //to print the options
	    
	    List<WebElement> print = sel.getOptions();
	    print.size();
        for(int i=0;i<print.size();i++)
        {
        System.out.println(print.get(i).getText()); 	
        }
	    
	    driver.close();
	}
}
