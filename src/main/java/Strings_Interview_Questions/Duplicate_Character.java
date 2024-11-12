package Strings_Interview_Questions;

public class Duplicate_Character {

	public static void main(String[] args) 
	{
		String s = " SUNYOPSUU";
		int leng = s.length();
		char a[] = s.toCharArray();
		for(int i=0;i<leng;i++)
		{
		for(int j=i+1;j<leng;j++)
		{
		if(a[i]==a[j])
		{
		System.out.print(" Duplicate Character is : "+ a[j]);
		break;
		}
		}
		}

		

	}

}
