import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1
{
	 public WebDriver driver;
	@Test
	public void Creat()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id(("twotabsearchtextbox"))).sendKeys("Iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> phones=driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		System.out.println("No of phones on page are"+" "+ phones.size());
		for(int i=0;i<phones.size();i++)
		{
			phones.get(i).getText();
			if(phones.equals("Apple iPhone 14 (128 GB) - Midnight"))
			{
				phones.get(i).click();
			}
			else
			{
				System.out.println("Hello");
			}
		}
			
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		String value= driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).getText();
		Assert.assertEquals(value, "1");
		
		//span[text()='Apple iPhone 14 (128 GB) - Midnight']
		//div[@class='puisg-row']
		
	}     


}
