package public_access_specifiers;

public class example14 
{
 public int a;
 
 public example14()
 {
	 a=450;
 }
	
	
	
	public void m3()
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		example14 s14 = new example14();
		s14.m3();
	    System.out.println(s14.a);
	}
	
	
	
	
	
	
	
	
	
}
