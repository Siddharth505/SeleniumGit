package Collections;

import org.testng.annotations.Test;

public class Stack 
{
	@Test
	public void T()
	{
		java.util.Stack s = new java.util.Stack();
		s.push("A");
		s.push("B");
		s.push("C");
        
		System.out.println(s);
		
		System.out.println(s.search("A")); // the Order will be 3 as it is LIFO	
	}

}
