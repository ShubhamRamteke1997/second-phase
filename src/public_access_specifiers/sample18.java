package public_access_specifiers;

public class sample18  //protected specifires
{

	
	protected int a;
	
	protected sample18()
	{
		a=100;
	}
	
	protected void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		
		sample18 s18 = new sample18();
		s18.m1();
		System.out.println(s18.a);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
