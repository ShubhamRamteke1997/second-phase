package public_access_specifiers;

public class demo7//public specifiers
{

	
	public int a;
	
	public demo7()
	{
		a=50;
	}
	 public void m1()
	 {
		 System.out.println(a);
	 }
	
	public static void main(String[] args) {
		
		demo7 s7 = new demo7();
		s7.m1();
		System.out.println(s7.a);
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
