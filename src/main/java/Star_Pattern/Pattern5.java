package Star_Pattern;

import org.testng.annotations.Test;

public class Pattern5 
{
    //    *****
	//    **** 
	//    ***
	//    **
	//    *

	@Test
	public void M5()
	{
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(" ");
		 }
	 for(int k=5;k>=i;k--)
	 {
		 System.out.print("*"); 
	 }
	 System.out.println(" ");
	 }
		
	}
}
