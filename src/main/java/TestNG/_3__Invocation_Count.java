package TestNG;

import org.testng.annotations.Test;

public class _3__Invocation_Count 
{
	@Test(invocationCount=2)
	public void Mayank()
	{
	System.out.print("Mayank");
	}
	
	@Test(invocationCount=1)
	public void Vishal()
	{
		System.out.print("Vishal");
		
	}
	
	@Test(invocationCount=3)
	public void Dinesh()
	{
		System.out.print("Dinesh");
		
	}

}
