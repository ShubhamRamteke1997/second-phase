package public_access_specifiers;

public class protected1  //protected keyword specifiers 
{

	
	protected int a;
	
	protected protected1()
	{
		a=12000000;
	}
	
	
	protected void m1()
	{
		System.out.println(a);
	}
	 
	public static void main(String[] args) {
		protected1 p1 = new protected1();
		p1.m1();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
