import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng 
{
	
	@Test
	public void Assertion()
	{
		int a =10;
		int b=20;
		
		//Assert.assertEquals(a, b,"Result");
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, b, "Result");
		System.out.println("Test Pass");
	}
	

}
