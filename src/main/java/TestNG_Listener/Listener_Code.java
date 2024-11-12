package TestNG_Listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener_Code extends TestListenerAdapter 
{
  public void onTestStart(ITestResult tr)
  {
	System.out.println("Test Case Started");  
  }

  public void onTestSuccess(ITestResult tr)
  {
	System.out.println("Test Case Success");  
  }

  public void onTestFail(ITestResult tr)
  {
	System.out.println("Test Case Failed");  
  }

  public void onTestSkipped(ITestResult tr)
  {
	System.out.println("Test Case Skipped");  
  }

  
}
