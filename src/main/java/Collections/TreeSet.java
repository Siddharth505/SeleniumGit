package Collections;

import org.testng.annotations.Test;

public class TreeSet 
{
	@Test
	public void M()
	{
		java.util.TreeSet tr = new java.util.TreeSet();
		
		tr.add("A");
		tr.add("a");
		tr.add("B");
		tr.add("b");
		tr.add("XZ");
		//tr.add(100);
		//tr.add(null);
		System.out.println(tr.size());
		System.out.println(tr);
	}

}
