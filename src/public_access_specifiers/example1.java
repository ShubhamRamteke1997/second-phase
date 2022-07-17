package public_access_specifiers;

public class example1//private specifiers
{
 
	private int a;
	
	private example1()
	{
		a= 88;
	}
	 
	private void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		example1 e1 = new example1();
		e1.m1();
		System.out.println(e1.a);
	}
	
	
	
	
	
	
	
	
	
}
