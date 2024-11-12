package Selenium_Webelements;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class _1_Handle_Browser 
{
	@Test
	public void B() throws InterruptedException
	{
		ChromeDriverManager.chromiumdriver().setup();
        WebDriver driver = (WebDriver) new GeckoDriverInfo();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	    System.out.println(driver.getWindowHandles());    // This will work fine but now we will Modify the Code
	    
	    // METHOD 2 Using Set and Arraylist
	    Set<String> BrowserID = driver.getWindowHandles();
	    ArrayList<String> BrowserID2 = new ArrayList(BrowserID);
	    
	    String ParentID = BrowserID2.get(0);
	    String ChildID  = BrowserID2.get(1);
	    System.out.println("ParentID is" +ParentID);
	    System.out.println("ChildID is" +ChildID);
	    
	    // Switch Window
	    
	    driver.switchTo().window(ParentID);
	    
	    // Close a Specific Tab
	    for( String Id:BrowserID2)
	    {
	      String title=driver.switchTo().window(Id).getTitle();
	      if(title.equals("OrangeHRM"))
	      {
	    	  driver.close();
	      }
	    }
	    
	}

}
