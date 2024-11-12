package Strings_Interview_Questions;

public class _1_Immutable 
{
	 public static void main(String[] args) 
	 {
	   String s =new String("Automation");
		 s.concat(s+"Tester");
		 System.out.println(s);
		 
		 String s1="Selenium";
		 s1.concat(s1+"Tutorial");
		 System.out.println(s1);
	 }

}
