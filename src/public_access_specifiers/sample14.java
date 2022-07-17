package public_access_specifiers;

public class sample14//public specifires
{

	 public int a;
	 
	 public sample14()
	 {
		 a=40;
	 }
	
	public void name()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		sample14 s14 = new sample14();
		s14.name();
	System.out.println(s14.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
