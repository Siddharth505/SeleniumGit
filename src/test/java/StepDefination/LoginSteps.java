package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	WebDriver driver=null;
	
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() 
	{
	 System.setProperty("webdriver.chrome.driver","/Automation/Drivers/chromedriver") ;
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("User Passes Username and Password")
	public void user_passes_username_and_password() 
	{
	driver.navigate().to("google.com");
	}

	@When("Clicks at Login button")
	public void clicks_at_login_button() 
	{
	 
	}

	@Then("User is navigated at home page")
	public void user_is_navigated_at_home_page() 
	{
		
	}
	

}
