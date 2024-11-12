package Collections;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Set 
{
	@Test
	public void SE()
	{
		java.util.Set se = new LinkedHashSet();
		se.add(100);
		se.add("True");
		se.add(200);
		se.add(300);
		se.add(300);
		System.out.println(se);
		
	}
	

}
