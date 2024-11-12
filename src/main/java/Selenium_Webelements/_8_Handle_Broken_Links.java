package Selenium_Webelements;

import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _8_Handle_Broken_Links 
{
	
	@Test
	public void Send() throws AWTException, InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		//ChromeDriverManager.chromiumdriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	    //capture links from webpage
	    List< WebElement> links = driver.findElements(By.tagName("a"));
	    
	    //Number of Links
	    System.out.println(links.size());
	    
	    for(int i=0;i<links.size();i++)
	    {
	    	WebElement element= links.get(i);
	    	String url= element.getAttribute("href");
	        
	    	URL link = new URL(url);
	    	
	    	//create a connection using url obj link
	    	HttpURLConnection http = (HttpURLConnection) link.openConnection();
	    	Thread.sleep(2000);
	    	// establish connection
	    	http.connect();
	    	
	    	int rescode =http.getResponseCode();
	    	if(rescode>=400)
	    	{
	    		System.out.println(url + "  " +"  is broken " );
	    	}
	    	else
	    	{
		    	{
		    		System.out.println(url + "  " +"  is Valid " );
		    	}
	
	    	}
	    	
	    				    	
	    	
	    	
	    	
	    }
	    
	}
}
