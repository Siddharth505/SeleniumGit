package TestNG;

import org.testng.annotations.Test;

@Test(groups="smoke")
public class _2_Priority_Basis_Execution 
{
	@Test(priority=2)
	public void Mayank()
	{
	System.out.print("Mayank");
	}
	
	@Test(priority=1)
	public void Vishal()
	{
		System.out.print("Vishal");
		
	}
	
	@Test(priority=3,dependsOnMethods = "Vishal")
	public void Dinesh()
	{
		System.out.print("Dinesh");
		
	}

}
