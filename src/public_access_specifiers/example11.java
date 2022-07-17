package public_access_specifiers;

public class example11 //default specifiers
{

	
	int a;
	
	example11()
	{
		a=500;
	}
	
	void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		example11 s11 = new example11();
		s11.m1();
		System.out.println(s11.a);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
