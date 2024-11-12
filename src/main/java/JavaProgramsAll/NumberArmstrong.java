package JavaProgramsAll;

public class NumberArmstrong 
{
	// 153= 1*1*1 +5*5*5 + 3*3*3= 153
	public static void main(String[] args) 
	{
	
		int n1=152,n2,n3=0,n4 = 0;
	    n2=n1;
	    
	    while(n1>0)
	    {
	    	n3=n1%10;
	    	n4=n4+ n3*n3*n3;
	    	n1=n1/10;
	    }
	    if(n2==n4)
	    {
	    	System.out.println("Number is armstrong");
	    }
	    else
	    {
	    	System.out.println("No");
	    }
	
	
	
	
	
	}
}
