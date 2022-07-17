package public_access_specifiers;

public class sample16 //default specifiers
{
    int a;
     
    sample16()
    {
    	a=9990;
    	
    	
    }
	
    void m1()
    {
    	System.out.println(a);
    }
	public static void main(String[] args) {
		
		
		sample16 s16 = new sample16();
		s16.m1();
		System.out.println(s16.a);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
