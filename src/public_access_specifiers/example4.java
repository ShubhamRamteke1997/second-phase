package public_access_specifiers;

public class example4  //protected 
{

	protected int a;
	
	protected example4()
	{
		a=100;
	}
	
	
	protected void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		example4 s4 = new example4();
		s4.m1();
		
		System.out.println(s4.a);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
