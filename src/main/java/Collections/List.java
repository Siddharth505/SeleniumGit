package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class List 
{
	@Test
	public void M1()
	{
		 
		
		java.util.List<String> li = new ArrayList<String>();
		java.util.List<String> lu = new ArrayList<String>();
		java.util.List<Integer> lp = new ArrayList<Integer>();
		java.util.List la= new LinkedList();
		java.util.List aa= new java.util.Stack();
		
		
		lp.add(432);
		
		li.add("Siddharth");
		li.add("Siddharth");
		li.add(1, "Sidd");   // add at specific index
		//li.add(32);
		
		lu.add("Jane");
		lu.add(1, "Martin");
		lu.add(2, null);
		li.addAll(lu); 
		
		lu.remove(2);
		lu.set(0, "Shahrukh");
	    
		System.out.println(li); 
		System.out.println(lu); 
		
	}

}
