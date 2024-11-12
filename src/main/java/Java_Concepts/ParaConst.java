package Java_Concepts;

public class ParaConst 
{
	int id;
	String name;
    
	ParaConst(  int i,String n)
	{
	  id=i;
	  name=n;
	}
	void display()
	{
		System.out.println(id+""+name);
	}

	public static void main(String[] args) 
	{
     
		ParaConst ab = new ParaConst(100,"Suny");
		ParaConst ab1 = new ParaConst(101,"SSuny");
		
		ab.display();
		ab1.display();
	}
}
