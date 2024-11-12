package Number_Pattern;

import org.testng.annotations.Test;

public class Pattern1 
{
	// 1
	// 12
	// 123
	// 1234
	
	@Test
	public void M1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( j );
			}
			System.out.println(" ");
		}
	}

}
