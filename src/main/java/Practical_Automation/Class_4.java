package Practical_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_4 
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
	    
	    // Is Enabled Method
	    WebElement element1 = driver.findElement(By.id("searchDropdownBox"));
	    System.out.println("Is Enabled"+element1.isEnabled());
	    
	    
	    WebElement element2 = driver.findElement(By.id("nav-logo-sprites"));
	    System.out.println("Is Displayed"+element2.isDisplayed());
	    
	    // IS Selected - For Radio Button , Dropdowns
	    System.out.println("Is Selected"+element2.isSelected());
	    
	    
	    driver.close();
	    
	}
}
