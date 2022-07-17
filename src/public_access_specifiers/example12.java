package public_access_specifiers;

public class example12  //protected specifiers
{

	
	protected int a;
	
	
	protected example12()
	
	{
		a=400;
	}
	
	protected void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
	     
		example12 s12 = new example12();
		s12.m1();
		System.out.println(s12.a);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
