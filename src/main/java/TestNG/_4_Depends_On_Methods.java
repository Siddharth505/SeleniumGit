package TestNG;

import org.testng.annotations.Test;

public class _4_Depends_On_Methods 
{
	@Test
	public void Login()
	{
	System.out.println("Login");
	}
	
	@Test(dependsOnMethods="Login")
	public void Creation()
	{
		System.out.println("Creation");
		
	}
	
	@Test(dependsOnMethods="Creation")
	public void Delete()
	{
		System.out.println("Delete");
		
	}

}
