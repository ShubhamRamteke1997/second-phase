package public_access_specifiers;

public class example2  //default specifiers
{
    int a;
    
    
    example2()
    {
    	a=80;
    }
	
    void m1()
    {
    	System.out.println(a);
    }
	
	public static void main(String[] args) {
		
		example2 s2 = new example2();
		s2.m1();
		System.out.println(s2.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
