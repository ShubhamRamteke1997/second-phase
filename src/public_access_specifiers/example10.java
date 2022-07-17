package public_access_specifiers;

public class example10 //private specifiers
{

	
	private int a;
	
	private example10()
	{
		a=500;
	}
	
	
	private  void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		example10 s10 = new example10();
		s10.m1();
		System.out.println(s10.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
