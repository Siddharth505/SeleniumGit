package Strings_Interview_Questions;

public class _11_Remove_WhiteSpaces_From_String 
{
	public static void main(String[] args) 
	{
		
		String s =" HI THERE	VALUE	FALSE BUT ";
		s=s.replaceAll("\\s","" );
				
		System.out.println(s);

	}

}



