package public_access_specifiers;

public class example7 
{
private int a;

private example7()
{
	a=600;
}
	
	
	private void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		example7 s7 = new example7();
       s7.m1();		
		System.out.println(s7.a);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
