package Strings_Interview_Questions;

import java.util.Arrays;

public class _2_Check_2_Strings_are_ANAGRAM 
{
public static void main(String[] args) {
		
		String x = "SILENT";
		String y = "LISTEN";
		
		x.toLowerCase();
		y.toLowerCase();
		System.out.println(x);
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		//System.out.println(x);
        
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		System.out.println(a);
		System.out.println(b);
		
		Boolean Result = Arrays.equals(a, b); 
		
		if(Result==true)
		{
			System.out.println("ANAGRAM");
		}
		else
		{
			System.out.println("NOT ANAGRAM");
		}
		}


}
