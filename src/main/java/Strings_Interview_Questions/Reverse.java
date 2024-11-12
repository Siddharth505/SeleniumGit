package Strings_Interview_Questions;

import org.testng.annotations.Test;

public class Reverse 
{
	
	public static void main(String args[])
	{
		
		String a = "abcdef";
		char[] b=a.toCharArray();
		
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
			//System.out.print(b[i]);
		}
				
	}

}
