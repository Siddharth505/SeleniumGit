package JavaProgramsAll;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int n1= 6;
		int fact=1;
		
		for(int i=1;i<=n1;i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial of number is" +fact);
	}

}
