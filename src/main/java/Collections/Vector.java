package Collections;

import org.testng.annotations.Test;

public class Vector 
{
	@Test
	public void Vec()
	{
		java.util.Vector<Integer> vc = new java.util.Vector<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			vc.addElement(i);
		}
		System.out.println(vc.capacity()+"");
	}

}
