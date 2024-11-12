package TestNG;

import org.testng.annotations.Test;

@Test(groups="smoke")
public class _1_Multiple_Test_Methods 
{
	@Test(groups="smoke")
	public void Mayank()
	{
	System.out.print("Mayank");
	}
	
	@Test(groups="functional")
	public void Vishal()
	{
		System.out.print("Vishal");
		
	}
	
	@Test(groups="smoke")
	public void Dinesh()
	{
		System.out.print("Dinesh");
		
	}

}
