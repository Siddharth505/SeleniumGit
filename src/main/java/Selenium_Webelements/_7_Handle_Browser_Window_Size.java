package Selenium_Webelements;

import java.awt.AWTException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _7_Handle_Browser_Window_Size 
{
	
	@Test
	public void Send() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
        Dimension d = new Dimension(400, 600);
        driver.manage().window().setSize(d);
        driver.navigate().to("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers#advanced_level_selenium_interview_questions");
        
        //(JavascriptExecutor)driver).executeScript("window.resizeTo(1024,700)");
        
	}
}
