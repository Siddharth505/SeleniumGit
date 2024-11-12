import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Testing 
{
	@Test
	public void B() throws InterruptedException
	{
		ChromeDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
	    driver.get("");
	    Thread.sleep(4000);
	    
	}

}
