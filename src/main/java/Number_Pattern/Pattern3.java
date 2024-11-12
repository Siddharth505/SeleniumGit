package Number_Pattern;

import org.testng.annotations.Test;

public class Pattern3 
{
	
	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
	
	
	@Test
	public void A1()
	{
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count=count+1;
				System.out.print(count+ " " );
			}
			System.out.println();
		}
	}

}
