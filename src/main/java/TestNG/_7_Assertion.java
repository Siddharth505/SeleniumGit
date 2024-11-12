package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _7_Assertion 
{
	@Test
	public void AssertionTypes()
	{
		// soft Assertion
		
		int c=111;
		int d=2222;
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(c, d);
		System.out.println("Program for soft assertion");
		
		
		
		//hard Assertion
		int a =10;
		int b=12;
		
		//Assert.assertEquals(a, b, "Hard Assertion");
		System.out.println("Program 1");
		
		
	}

}
