package Strings_Interview_Questions;

public class _1_Reverse_A_String {

	public static void main(String[] args) 
	{
		String s = " LLAB NOGARD";
		String reverse=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+ s.charAt(i);
		}
		System.out.println(reverse);


		
	}

}
