package Collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortedSet 
{
	@Test
	public void Set()
	{
		java.util.SortedSet<Integer> se = new TreeSet<Integer>();
	    se.add(100);
	    se.add(10);
	    se.add(22200);
	    se.add(1000);
	    se.add(null);
	    se.add(5000);
	    se.add(112);
	    
	   System.out.println(se.last()); 
	        
	
	
	}

}
