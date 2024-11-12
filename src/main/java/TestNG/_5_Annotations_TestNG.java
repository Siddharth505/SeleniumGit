package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _5_Annotations_TestNG 
{
	@Test
	
	public void Method1()
	{
	  Reporter.log("Method1", true);
	}

@Test

public void Method2()
{
  Reporter.log("Method2", true);
}



@Test

public void Method3()
{
  Reporter.log("Method3", true);
}

@BeforeSuite
public void BSuite()
{
  Reporter.log("Before Suite", true);
}


@BeforeTest
public void BTest()
{
  Reporter.log("Before Test", true);
}

@BeforeMethod
public void BMethod()
{
  Reporter.log("Before Method", true);
}

@BeforeClass
public void BClass()
{
  Reporter.log("Before Class", true);
}

@AfterMethod
public void AMethod()
{
  Reporter.log("After Method", true);
}


@AfterClass
public void AClass()
{
  Reporter.log("After Class", true);
}

@AfterSuite
public void ASuite()
{
  Reporter.log("After Suite", true);
}

@AfterTest
public void ATest()
{
  Reporter.log("After Test", true);
}

}
