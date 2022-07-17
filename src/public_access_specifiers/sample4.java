package public_access_specifiers;

public class sample4 //protected specifires
{
	protected int a;
	
	protected sample4()
	{
		a=20;
	}
	
	protected void name()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		sample4 s4 = new sample4();
		s4.name();
		System.out.println(s4.a);
		
		
		
		
	}
	
	
	
	
	

}
