package public_access_specifiers;

public class demo1  //private class
{
 private int a;
	
	private demo1()
	{
		a=30;
	}
	
	private void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		demo1 d1 = new demo1();
		d1.m1();
		System.out.println(d1.a);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
