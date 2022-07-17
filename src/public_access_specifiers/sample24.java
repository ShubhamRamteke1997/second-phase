package public_access_specifiers;

public class sample24  //default specifiers
{
   int a;
   
  
   sample24()
   {
	   a=1200000;
   }
	  
   void m1()
   {
	   System.out.println(a);
   }
	
	
	public static void main(String[] args) {
		
		sample24 s24 = new sample24();
		s24.m1();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
