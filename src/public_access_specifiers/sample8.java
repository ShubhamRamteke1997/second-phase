package public_access_specifiers;

public class sample8//private class
{
 private int a;
 
 
 private sample8()
 {
	 a=20;
 }
	
	private void m1()
	{
	   System.out.println(a);
	}
	
	  public static void main(String[] args) {
		sample8 s8 = new sample8();
		s8.m1();
	    
	  }
	
	
	
	
	
	
	
	
	
}
