package Star_Pattern;

import org.testng.annotations.Test;

public class Pattern4 
{
	//    *
	//   ** 
	//  ***
	// ****
	//*****
    
	// so here in every line there are spaces before star so we have to prepare a loop for it
	
	@Test
	public void M4()
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");	
		}
		System.out.println( );
		}
	}
}
