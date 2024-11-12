package CommonPrograms;

public class PrimeNo 
{
	public static boolean IsPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num;i++)
		{
			if(num%2==0)
			{
				return false;
			}
		}
		return true;
	}
  public static void main(String [] args)
  {
	System.out.println(IsPrime(5));  
  }
}
