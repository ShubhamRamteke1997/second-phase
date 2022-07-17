package public_access_specifiers;

public class example6//public specifiers
{

	public int a;
	
	public example6()
	{
		a=500;
	}
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		example6 s6 = new example6();
		s6.m1();
		System.out.println(s6.a);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
