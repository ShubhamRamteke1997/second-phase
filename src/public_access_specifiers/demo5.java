package public_access_specifiers;

public class demo5 //protected 
{
   protected int a;
   
   
   protected demo5()
   {
	   a=200;
   }
	
	
	protected void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		demo5 s5 = new demo5();
		s5.m1();
		
		System.out.println(s5.a);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
