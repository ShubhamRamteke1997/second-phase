package public_access_specifiers;

public class demo2  //default specifiers
{

	int a;
	
	demo2()
	{
		a=50;
	}
	
	void m1()
	{
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		demo2 s2 = new demo2();
		s2.m1();
		System.out.println(s2.a);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
