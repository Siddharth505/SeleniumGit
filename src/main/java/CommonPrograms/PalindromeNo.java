package CommonPrograms;

import java.util.Scanner;

import org.testng.reporters.jq.Main;

public class PalindromeNo
{
	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num1=sc.nextInt();
		int num2=num1;
		int rev=0;
		while(num1 !=0)
		{
			rev=rev*10 +num1%10;
			num1=num1/10;	
		}
		if(num1==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("No is not palindrome");
		}
	}

}
