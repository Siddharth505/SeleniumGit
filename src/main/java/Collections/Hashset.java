package Collections;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Hashset 
{
	@Test
	public void S()
	{
		HashSet s = new HashSet();
	    s.add(100);
	    s.add(100);
	    s.add(200);
	    s.add(400);
	    s.add(1000000);
	    System.out.println(s);
	
	}

}
