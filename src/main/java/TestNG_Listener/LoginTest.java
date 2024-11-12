package TestNG_Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Code.class)
public class LoginTest
{
	@Test
	public void Pass()
	{
		Assert.assertEquals("Sidd", "Sidd");
	}

	@Test
	public void Fail()
	{
		Assert.assertEquals("Sidd1", "Sidd");
	}
}
