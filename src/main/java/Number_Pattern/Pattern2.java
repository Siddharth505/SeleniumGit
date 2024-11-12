package Number_Pattern;

import org.testng.annotations.Test;

public class Pattern2 
{
	    // 1
		// 22
		// 333
		// 4444
		
		@Test
		public void M1()
		{
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print( i );
				}
				System.out.println(" ");
			}
		}

}
