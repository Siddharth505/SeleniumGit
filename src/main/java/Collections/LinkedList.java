package Collections;

import org.testng.annotations.Test;

public class LinkedList 
{
	@Test
	public void LL()
	{
		java.util.LinkedList li = new java.util.LinkedList();
		
		li.add(2);
		li.addLast(100);
		
		li.addFirst(1);
		System.out.println(li);
	}

}
