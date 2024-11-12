package Practical_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_7 
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
	    
	    WebElement Enterdata= driver.findElement(By.id("twotabsearchtextbox"));
	    Enterdata.sendKeys("Guitar");
	    Enterdata.clear();
	    System.out.println(Enterdata.getAttribute("spellcheck"));

	    System.out.println(Enterdata.getText());
	    
	    
	}
}
