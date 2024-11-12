package Collections;

import org.testng.annotations.Test;

public class ArrayList 
{
	@Test
	public void A()
	{
		java.util.ArrayList al = new java.util.ArrayList();
		
		al.add("Siddharth");
		al.add(10);
		al.add(null);
		al.add(3, 42.32);
		System.out.println(al);
	}

}
