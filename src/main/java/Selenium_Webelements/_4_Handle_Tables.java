package Selenium_Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class _4_Handle_Tables 
{
	@Test
	public void S()
	{

		ChromeDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
	    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	    
	    // print the headers
	    
	    List<WebElement> Headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
	    Headers.size();
	    for(int i=0;i<Headers.size();i++)
	    {
	    	System.out.println(Headers.get(i).getText()); 
	    }
	    
	    // print the row data excluding headers
	    List<WebElement> tabledata=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	    for(int i=1;i<tabledata.size()-1;i++)
	    {
	    	System.out.println(tabledata.get(i).getText()); 
	    }
	    
	    // find the height of clock Tower hotel
	    //xpath = //table[@class='tsc_table_s13']//th[.='Clock Tower Hotel']/..//td[text()='601')]
	    
	    
	    
driver.close();	    
	}

}
