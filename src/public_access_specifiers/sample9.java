package public_access_specifiers;

public class sample9 //default specifiers
{
 int a;
 
 sample9()
 {
	 a=30;
 }
	
	
	
	void m1()
	
	{
		System.out.println(a);
	}
static public void main(String[] args) {
		
		sample9 s9 = new sample9();
		s9.m1();
		System.out.println(s9.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
