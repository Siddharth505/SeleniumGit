package Star_Pattern;

import org.testng.annotations.Test;

public class Pattern2 
{
	 // ****
	 // ***
	 // **
	 // *
	
	// here pattern is starting with 4 coloums and then it is decrementing and rows are constant 
	// 

	@Test
	public void M2()
	{
		for (int i=1;i<=4;i++)
		{
			for ( int j=4;j>=i;j--)
			{
			  System.out.print("*");	
			}
		      System.out.println();
		}
	}
}
