package Star_Pattern;

import org.testng.annotations.Test;

public class Pattern1 
{
	 // *
	 // **
	 // ***
	 // ****
	
	// here i and j both are incremented. Make loop for Rows and 
	// 
  @Test
  public void M1()
  {
	  
	  for (int i=1;i<=4;i++) 
	  {
		  for ( int j=1;j<=i;j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println("");
	  }
  }
	
}
