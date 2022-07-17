package public_access_specifiers;

public class sample11 //protected specifires
{
    protected int a;
    
    protected sample11()
    {
    	a=20;
    }
	
	protected void m1()
	
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		sample11 s11 = new sample11();
		s11.m1();
	}
	
	
	
	
	
}
