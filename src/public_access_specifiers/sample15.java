package public_access_specifiers;

public class sample15 //private specifires
{

	 private int a;
	 
	 
	 private sample15()
	 {
		 a=888;
	 }
	
	private void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		sample15 s15= new sample15();
		s15.m1();
		System.out.println(s15.a);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
