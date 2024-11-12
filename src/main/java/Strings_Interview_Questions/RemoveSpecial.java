package Strings_Interview_Questions;

public class RemoveSpecial {

	 
	
		
		public static void main(String args[])
		{
			
			String a = "ab^cd*ef";
			
		String b=	a.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println(b);
					
		}
	
}
