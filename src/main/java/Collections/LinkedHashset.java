package Collections;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class LinkedHashset 
{
	@Test
	public void Has() 
	{
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("Siddhartj");
		lh.add("Joh");
		lh.add("pika");
		System.out.println(lh);
		
		// Insertion order Preseverved
		
	}

}
