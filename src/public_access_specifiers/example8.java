package public_access_specifiers;

public class example8 //protected 
{
  protected int a;
  
  protected example8()
  {
	  a=700;
  }
	
  protected void m1()
  {
	  System.out.println(a);
  }
	
	
	public static void main(String[] args) {
		
		example8 s8 = new example8();
		s8.m1();
		System.out.println(s8.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
