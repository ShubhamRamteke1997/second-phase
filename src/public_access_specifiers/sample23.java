package public_access_specifiers;

public class sample23 //private class
{
    private int a;
    
    private sample23()
    {
    	a=200;
    }

 private void m1()
 {
	 System.out.println(a);
 }

  public static void main(String[] args) {
	
	  sample23 s2 = new sample23();
	  s2.m1();
	  System.out.println(s2.a);
	  
	  
}














}
